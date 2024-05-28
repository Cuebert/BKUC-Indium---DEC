.class public final Ld2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld2/b$a;
    }
.end annotation


# static fields
.field private static final b:Ld2/b;


# instance fields
.field private final a:Ld2/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ld2/b$a;

    invoke-direct {v0}, Ld2/b$a;-><init>()V

    invoke-virtual {v0}, Ld2/b$a;->a()Ld2/b;

    move-result-object v0

    sput-object v0, Ld2/b;->b:Ld2/b;

    return-void
.end method

.method constructor <init>(Ld2/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld2/b;->a:Ld2/e;

    return-void
.end method

.method public static b()Ld2/b$a;
    .locals 1

    new-instance v0, Ld2/b$a;

    invoke-direct {v0}, Ld2/b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()Ld2/e;
    .locals 1
    .annotation build Lo5/d;
        tag = 0x1
    .end annotation

    iget-object v0, p0, Ld2/b;->a:Ld2/e;

    return-object v0
.end method
