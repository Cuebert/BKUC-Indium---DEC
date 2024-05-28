.class public Lcom/roblox/universalapp/messagebus/Connection;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:J


# direct methods
.method constructor <init>(J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lcom/roblox/universalapp/messagebus/Connection;->a:J

    return-void
.end method

.method private native deleteSharedPtr(J)V
.end method

.method private native isConnected(J)Z
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/universalapp/messagebus/Connection;->a:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/universalapp/messagebus/Connection;->deleteSharedPtr(J)V

    return-void
.end method

.method public finalize()V
    .locals 2

    iget-wide v0, p0, Lcom/roblox/universalapp/messagebus/Connection;->a:J

    invoke-direct {p0, v0, v1}, Lcom/roblox/universalapp/messagebus/Connection;->deleteSharedPtr(J)V

    return-void
.end method
