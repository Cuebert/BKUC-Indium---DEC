.class public final synthetic Lcom/roblox/client/s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/roblox/client/t0;

.field public final synthetic o:Landroidx/fragment/app/d;

.field public final synthetic p:Le8/h;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/t0;Landroidx/fragment/app/d;Le8/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/s0;->n:Lcom/roblox/client/t0;

    iput-object p2, p0, Lcom/roblox/client/s0;->o:Landroidx/fragment/app/d;

    iput-object p3, p0, Lcom/roblox/client/s0;->p:Le8/h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lcom/roblox/client/s0;->n:Lcom/roblox/client/t0;

    iget-object v1, p0, Lcom/roblox/client/s0;->o:Landroidx/fragment/app/d;

    iget-object v2, p0, Lcom/roblox/client/s0;->p:Le8/h;

    invoke-static {v0, v1, v2}, Lcom/roblox/client/t0;->B2(Lcom/roblox/client/t0;Landroidx/fragment/app/d;Le8/h;)V

    return-void
.end method
