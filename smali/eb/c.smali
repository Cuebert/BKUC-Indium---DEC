.class public abstract Leb/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Leb/c$a;
    }
.end annotation


# static fields
.field public static final n:Leb/c$a;

.field private static final o:Leb/c;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Leb/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Leb/c$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Leb/c;->n:Leb/c$a;

    sget-object v0, Lya/b;->a:Lya/a;

    invoke-virtual {v0}, Lya/a;->b()Leb/c;

    move-result-object v0

    sput-object v0, Leb/c;->o:Leb/c;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a()Leb/c;
    .locals 1

    sget-object v0, Leb/c;->o:Leb/c;

    return-object v0
.end method


# virtual methods
.method public abstract b()I
.end method
