.class Lcom/roblox/client/landing/AboutActivity$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/roblox/client/landing/AboutActivity;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lcom/roblox/client/landing/AboutActivity;


# direct methods
.method constructor <init>(Lcom/roblox/client/landing/AboutActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/roblox/client/landing/AboutActivity$a;->n:Lcom/roblox/client/landing/AboutActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    const-string p1, "about"

    const-string v0, "close"

    .line 1
    invoke-static {p1, v0}, Lcom/roblox/client/f0;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    iget-object p1, p0, Lcom/roblox/client/landing/AboutActivity$a;->n:Lcom/roblox/client/landing/AboutActivity;

    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 3
    iget-object p1, p0, Lcom/roblox/client/landing/AboutActivity$a;->n:Lcom/roblox/client/landing/AboutActivity;

    sget v0, Lcom/roblox/client/t;->c:I

    sget v1, Lcom/roblox/client/t;->a:I

    invoke-virtual {p1, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    return-void
.end method
