.class public Lcom/roblox/engine/jni/video/VideoCodecSupportedType;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public levels:[Ljava/lang/String;

.field public maxBitrate:I

.field public maxFps:I

.field public maxHeight:I

.field public maxInstances:I

.field public maxWidth:I

.field public minBitrate:I

.field public minFps:I

.field public minHeight:I

.field public minWidth:I

.field public name:Ljava/lang/String;

.field public profiles:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I[Ljava/lang/String;[Ljava/lang/String;IIIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->name:Ljava/lang/String;

    .line 3
    iput p2, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->maxInstances:I

    .line 4
    iput-object p3, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->profiles:[Ljava/lang/String;

    .line 5
    iput-object p4, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->levels:[Ljava/lang/String;

    .line 6
    iput p5, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->minWidth:I

    .line 7
    iput p6, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->maxWidth:I

    .line 8
    iput p7, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->minHeight:I

    .line 9
    iput p8, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->maxHeight:I

    .line 10
    iput p9, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->minFps:I

    .line 11
    iput p10, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->maxFps:I

    .line 12
    iput p11, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->minBitrate:I

    .line 13
    iput p12, p0, Lcom/roblox/engine/jni/video/VideoCodecSupportedType;->maxBitrate:I

    return-void
.end method
