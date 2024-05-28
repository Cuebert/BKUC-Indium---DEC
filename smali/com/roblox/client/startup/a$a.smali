.class Lcom/roblox/client/startup/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/startup/a;->g2(Landroid/os/Bundle;)Landroid/app/Dialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/startup/a;


# direct methods
.method constructor <init>(Lcom/roblox/client/startup/a;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/startup/a$a;->n:Lcom/roblox/client/startup/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 0

    const-string p1, "FragmentRetry"

    const-string p2, "... Dialog::onClick:"

    .line 1
    invoke-static {p1, p2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object p1, p0, Lcom/roblox/client/startup/a$a;->n:Lcom/roblox/client/startup/a;

    invoke-static {p1}, Lcom/roblox/client/startup/a;->p2(Lcom/roblox/client/startup/a;)Lcom/roblox/client/startup/a$b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lcom/roblox/client/startup/a$a;->n:Lcom/roblox/client/startup/a;

    invoke-static {p1}, Lcom/roblox/client/startup/a;->p2(Lcom/roblox/client/startup/a;)Lcom/roblox/client/startup/a$b;

    move-result-object p1

    invoke-interface {p1}, Lcom/roblox/client/startup/a$b;->n0()V

    :cond_0
    return-void
.end method
