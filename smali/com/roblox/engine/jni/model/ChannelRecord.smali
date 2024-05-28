.class public Lcom/roblox/engine/jni/model/ChannelRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:J


# direct methods
.method public constructor <init>(Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->a:Ljava/lang/String;

    .line 3
    iput-wide p2, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->b:J

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b(J)Z
    .locals 3

    iget-wide v0, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->b:J

    cmp-long v2, v0, p1

    if-gez v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public c()Z
    .locals 5

    iget-wide v0, p0, Lcom/roblox/engine/jni/model/ChannelRecord;->b:J

    const-wide/16 v2, 0x0

    cmp-long v4, v2, v0

    if-nez v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
