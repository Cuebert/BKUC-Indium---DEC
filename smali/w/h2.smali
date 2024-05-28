.class public abstract Lw/h2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw/h2$a;,
        Lw/h2$b;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lw/h2$b;Lw/h2$a;)Lw/h2;
    .locals 1

    new-instance v0, Lw/e;

    invoke-direct {v0, p0, p1}, Lw/e;-><init>(Lw/h2$b;Lw/h2$a;)V

    return-object v0
.end method


# virtual methods
.method public abstract b()Lw/h2$a;
.end method

.method public abstract c()Lw/h2$b;
.end method

.method public final d(Lw/h2;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lw/h2;->c()Lw/h2$b;

    move-result-object v0

    .line 2
    invoke-virtual {p1}, Lw/h2;->b()Lw/h2$a;

    move-result-object p1

    .line 3
    invoke-virtual {p1}, Lw/h2$a;->b()I

    move-result p1

    invoke-virtual {p0}, Lw/h2;->b()Lw/h2$a;

    move-result-object v1

    invoke-virtual {v1}, Lw/h2$a;->b()I

    move-result v1

    if-gt p1, v1, :cond_0

    invoke-virtual {p0}, Lw/h2;->c()Lw/h2$b;

    move-result-object p1

    if-ne v0, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
