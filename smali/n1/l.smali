.class public final Ln1/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/l$a;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/String;


# direct methods
.method synthetic constructor <init>(Ln1/l$a;Ln1/l0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ln1/l$a;->c(Ln1/l$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ln1/l;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()Ln1/l$a;
    .locals 2

    new-instance v0, Ln1/l$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln1/l$a;-><init>(Ln1/k0;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln1/l;->a:Ljava/lang/String;

    return-object v0
.end method
