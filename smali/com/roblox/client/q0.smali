.class public final synthetic Lcom/roblox/client/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lcom/roblox/client/t0;

.field public final synthetic o:Landroidx/fragment/app/d;


# direct methods
.method public synthetic constructor <init>(Lcom/roblox/client/t0;Landroidx/fragment/app/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/q0;->n:Lcom/roblox/client/t0;

    iput-object p2, p0, Lcom/roblox/client/q0;->o:Landroidx/fragment/app/d;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/q0;->n:Lcom/roblox/client/t0;

    iget-object v1, p0, Lcom/roblox/client/q0;->o:Landroidx/fragment/app/d;

    invoke-static {v0, v1}, Lcom/roblox/client/t0;->z2(Lcom/roblox/client/t0;Landroidx/fragment/app/d;)V

    return-void
.end method
