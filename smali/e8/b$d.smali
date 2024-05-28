.class public Le8/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf7/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Le8/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Le8/b;


# direct methods
.method public constructor <init>(Le8/b;)V
    .locals 0

    iput-object p1, p0, Le8/b$d;->a:Le8/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(ZJLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Le8/b$d;->a:Le8/b;

    invoke-static {v0, p1, p2, p3, p4}, Le8/b;->b(Le8/b;ZJLjava/lang/String;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Le8/h;)V
    .locals 3

    .line 1
    iget-object v0, p0, Le8/b$d;->a:Le8/b;

    invoke-static {v0}, Le8/b;->a(Le8/b;)Le8/a;

    move-result-object v0

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    invoke-virtual {p1}, Le8/h;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 3
    iget-object v0, p0, Le8/b$d;->a:Le8/b;

    sget v1, Lcom/roblox/client/c0;->r4:I

    invoke-virtual {v0, v1}, Le8/b;->d(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 4
    :cond_1
    invoke-virtual {p1, v0}, Le8/h;->b(Landroid/content/Context;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 5
    :goto_0
    iget-object v1, p0, Le8/b$d;->a:Le8/b;

    new-instance v2, Le8/b$d$a;

    invoke-direct {v2, p0, p1, v0}, Le8/b$d$a;-><init>(Le8/b$d;Le8/h;Ljava/lang/CharSequence;)V

    invoke-virtual {v1, v2}, Le8/b;->f(Ljava/lang/Runnable;)V

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 0

    return-void
.end method
