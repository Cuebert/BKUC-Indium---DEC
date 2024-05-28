.class Lcom/roblox/client/i0$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/i0;->y1(ZLcom/roblox/client/i0$g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/c1$d;

.field final synthetic o:Landroid/app/Activity;

.field final synthetic p:Ljava/lang/String;

.field final synthetic q:Lcom/roblox/client/i0$g;

.field final synthetic r:Z

.field final synthetic s:Lcom/roblox/client/i0;


# direct methods
.method constructor <init>(Lcom/roblox/client/i0;Lcom/roblox/client/c1$d;Landroid/app/Activity;Ljava/lang/String;Lcom/roblox/client/i0$g;Z)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/i0$c;->s:Lcom/roblox/client/i0;

    iput-object p2, p0, Lcom/roblox/client/i0$c;->n:Lcom/roblox/client/c1$d;

    iput-object p3, p0, Lcom/roblox/client/i0$c;->o:Landroid/app/Activity;

    iput-object p4, p0, Lcom/roblox/client/i0$c;->p:Ljava/lang/String;

    iput-object p5, p0, Lcom/roblox/client/i0$c;->q:Lcom/roblox/client/i0$g;

    iput-boolean p6, p0, Lcom/roblox/client/i0$c;->r:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    .line 1
    iget-object p1, p0, Lcom/roblox/client/i0$c;->o:Landroid/app/Activity;

    iget-object p2, p0, Lcom/roblox/client/i0$c;->p:Ljava/lang/String;

    invoke-static {p1, p2}, Lc9/l;->h(Landroid/app/Activity;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/i0$c;->q:Lcom/roblox/client/i0$g;

    const/4 p2, 0x1

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 3
    invoke-interface {p1, p2, v0}, Lcom/roblox/client/i0$g;->a(ZZ)V

    .line 4
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object p1

    invoke-interface {p1}, Lc7/e;->t0()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-boolean p1, p0, Lcom/roblox/client/i0$c;->r:Z

    if-eqz p1, :cond_1

    .line 5
    iget-object p1, p0, Lcom/roblox/client/i0$c;->s:Lcom/roblox/client/i0;

    iget-object v0, p0, Lcom/roblox/client/i0$c;->q:Lcom/roblox/client/i0$g;

    invoke-virtual {p1, p2, v0}, Lcom/roblox/client/i0;->y1(ZLcom/roblox/client/i0$g;)V

    :cond_1
    return-void
.end method
