.class Le8/b$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Le8/b$d;->c(Le8/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Le8/h;

.field final synthetic o:Ljava/lang/CharSequence;

.field final synthetic p:Le8/b$d;


# direct methods
.method constructor <init>(Le8/b$d;Le8/h;Ljava/lang/CharSequence;)V
    .locals 0

    iput-object p1, p0, Le8/b$d$a;->p:Le8/b$d;

    iput-object p2, p0, Le8/b$d$a;->n:Le8/h;

    iput-object p3, p0, Le8/b$d$a;->o:Ljava/lang/CharSequence;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Le8/b$d$a;->n:Le8/h;

    invoke-virtual {v0}, Le8/h;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    iget-object v0, p0, Le8/b$d$a;->p:Le8/b$d;

    iget-object v0, v0, Le8/b$d;->a:Le8/b;

    iget-object v1, p0, Le8/b$d$a;->o:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Le8/b;->c(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 3
    :cond_0
    iget-object v0, p0, Le8/b$d$a;->p:Le8/b$d;

    iget-object v0, v0, Le8/b$d;->a:Le8/b;

    invoke-static {v0}, Le8/b;->a(Le8/b;)Le8/a;

    move-result-object v0

    invoke-interface {v0}, Le8/a;->m()Lcom/roblox/client/k0;

    move-result-object v0

    iget-object v1, p0, Le8/b$d$a;->o:Ljava/lang/CharSequence;

    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roblox/client/k0;->U0(Ljava/lang/String;)V

    :goto_0
    return-void
.end method
