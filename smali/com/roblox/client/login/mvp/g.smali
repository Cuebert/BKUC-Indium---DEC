.class public Lcom/roblox/client/login/mvp/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/client/login/mvp/b;


# instance fields
.field private a:Lcom/roblox/client/login/mvp/f;


# direct methods
.method constructor <init>(Lcom/roblox/client/login/mvp/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/f;->k()V

    return-void
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/f;->f()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/f;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/f;->l()V

    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    invoke-virtual {v0}, Lcom/roblox/client/login/mvp/f;->g()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/login/mvp/h;)V
    .locals 7

    iget-object v0, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    new-instance v6, Lcom/roblox/client/login/mvp/g$a;

    invoke-direct {v6, p0, p6}, Lcom/roblox/client/login/mvp/g$a;-><init>(Lcom/roblox/client/login/mvp/g;Lcom/roblox/client/login/mvp/h;)V

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v6}, Lcom/roblox/client/login/mvp/f;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/roblox/client/login/mvp/f$b;)V

    return-void
.end method

.method public g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/roblox/client/login/mvp/g;->a:Lcom/roblox/client/login/mvp/f;

    invoke-virtual {v0, p1, p2, p3}, Lcom/roblox/client/login/mvp/f;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
