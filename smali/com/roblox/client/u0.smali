.class public final synthetic Lcom/roblox/client/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/roblox/client/t0$g;

.field public final synthetic o:Landroidx/fragment/app/d;

.field public final synthetic p:Ljava/lang/String;

.field public final synthetic q:Landroid/webkit/WebView;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/t0$g;Landroidx/fragment/app/d;Ljava/lang/String;Landroid/webkit/WebView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/u0;->n:Lcom/roblox/client/t0$g;

    iput-object p2, p0, Lcom/roblox/client/u0;->o:Landroidx/fragment/app/d;

    iput-object p3, p0, Lcom/roblox/client/u0;->p:Ljava/lang/String;

    iput-object p4, p0, Lcom/roblox/client/u0;->q:Landroid/webkit/WebView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lcom/roblox/client/u0;->n:Lcom/roblox/client/t0$g;

    iget-object v1, p0, Lcom/roblox/client/u0;->o:Landroidx/fragment/app/d;

    iget-object v2, p0, Lcom/roblox/client/u0;->p:Ljava/lang/String;

    iget-object v3, p0, Lcom/roblox/client/u0;->q:Landroid/webkit/WebView;

    invoke-static {v0, v1, v2, v3}, Lcom/roblox/client/t0$g;->b(Lcom/roblox/client/t0$g;Landroidx/fragment/app/d;Ljava/lang/String;Landroid/webkit/WebView;)V

    return-void
.end method
