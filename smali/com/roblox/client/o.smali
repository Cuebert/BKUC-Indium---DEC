.class public final synthetic Lcom/roblox/client/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic n:Lcom/roblox/client/IncomingCallActivity;

.field public final synthetic o:Landroid/content/Intent;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/o;->n:Lcom/roblox/client/IncomingCallActivity;

    iput-object p2, p0, Lcom/roblox/client/o;->o:Landroid/content/Intent;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/o;->n:Lcom/roblox/client/IncomingCallActivity;

    iget-object v1, p0, Lcom/roblox/client/o;->o:Landroid/content/Intent;

    invoke-static {v0, v1, p1}, Lcom/roblox/client/IncomingCallActivity;->S0(Lcom/roblox/client/IncomingCallActivity;Landroid/content/Intent;Landroid/view/View;)V

    return-void
.end method
