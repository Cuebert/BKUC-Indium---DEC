.class public Lc7/a$b;
.super Lc7/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lc7/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc7/a<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Z)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lc7/a;-><init>(Ljava/lang/String;Ljava/lang/Object;ZLc7/a$a;)V

    return-void
.end method


# virtual methods
.method public i()Ljava/lang/Boolean;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lc7/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-static {}, Lc7/f;->c()Lc7/f;

    move-result-object v0

    invoke-virtual {p0}, Lc7/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc7/f;->b(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    .line 3
    :cond_0
    invoke-super {p0}, Lc7/a;->g()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method
