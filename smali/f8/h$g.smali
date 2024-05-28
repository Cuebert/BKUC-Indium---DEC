.class Lf8/h$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf8/h$p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf8/h;->j1(Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;JLe8/g;Z)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lf8/h;


# direct methods
.method constructor <init>(Lf8/h;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lf8/h$g;->b:Lf8/h;

    iput-object p2, p0, Lf8/h$g;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .line 1
    iget-object v0, p0, Lf8/h$g;->b:Lf8/h;

    iget-object v1, p0, Lf8/h$g;->a:Ljava/lang/String;

    invoke-static {v0}, Lf8/h;->S(Lf8/h;)Z

    move-result v2

    invoke-static {v0, v1, v2}, Lf8/h;->T(Lf8/h;Ljava/lang/String;Z)Lcom/android/billingclient/api/g;

    move-result-object v0

    .line 2
    iget-object v1, p0, Lf8/h$g;->b:Lf8/h;

    iget-object v2, p0, Lf8/h$g;->a:Ljava/lang/String;

    invoke-static {v1}, Lf8/h;->S(Lf8/h;)Z

    move-result v3

    invoke-static {v1, v2, v0, v3}, Lf8/h;->U(Lf8/h;Ljava/lang/String;Lcom/android/billingclient/api/g;Z)Z

    move-result v1

    if-nez v1, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lf8/h$g;->b:Lf8/h;

    invoke-static {v1}, Lf8/h;->S(Lf8/h;)Z

    move-result v2

    invoke-static {v1, v0, v2}, Lf8/h;->i(Lf8/h;Lcom/android/billingclient/api/g;Z)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lf8/h;->V(Lf8/h;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    iget-object v0, p0, Lf8/h$g;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->l(Lf8/h;)Lx7/e;

    move-result-object v0

    new-instance v1, Le8/f;

    iget-object v2, p0, Lf8/h$g;->b:Lf8/h;

    invoke-static {v2}, Lf8/h;->k(Lf8/h;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lf8/h$g;->a:Ljava/lang/String;

    const/4 v4, 0x0

    invoke-direct {v1, v2, v3, v4}, Le8/f;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v0, v1}, Lx7/e;->k0(Le8/f;)V

    .line 5
    iget-object v0, p0, Lf8/h$g;->b:Lf8/h;

    invoke-static {v0}, Lf8/h;->m(Lf8/h;)V

    return-void
.end method
