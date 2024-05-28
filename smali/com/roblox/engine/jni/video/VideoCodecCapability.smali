.class public Lcom/roblox/engine/jni/video/VideoCodecCapability;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field hardware:Z

.field simpleName:Ljava/lang/String;

.field supportedTypes:[Lcom/roblox/engine/jni/video/VideoCodecSupportedType;


# direct methods
.method public constructor <init>(ZLjava/lang/String;[Lcom/roblox/engine/jni/video/VideoCodecSupportedType;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-boolean p1, p0, Lcom/roblox/engine/jni/video/VideoCodecCapability;->hardware:Z

    .line 3
    iput-object p2, p0, Lcom/roblox/engine/jni/video/VideoCodecCapability;->simpleName:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/roblox/engine/jni/video/VideoCodecCapability;->supportedTypes:[Lcom/roblox/engine/jni/video/VideoCodecSupportedType;

    return-void
.end method
