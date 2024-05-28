.class Lcom/roblox/audio/AppRtcDeviceWrapper$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roblox/audio/a$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/roblox/audio/AppRtcDeviceWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Lcom/roblox/audio/AppRtcDeviceWrapper;


# direct methods
.method private constructor <init>(Lcom/roblox/audio/AppRtcDeviceWrapper;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/roblox/audio/AppRtcDeviceWrapper$b;->a:Lcom/roblox/audio/AppRtcDeviceWrapper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/roblox/audio/AppRtcDeviceWrapper;Lcom/roblox/audio/AppRtcDeviceWrapper$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/roblox/audio/AppRtcDeviceWrapper$b;-><init>(Lcom/roblox/audio/AppRtcDeviceWrapper;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/roblox/audio/a$a;Ljava/util/Set;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/roblox/audio/a$a;",
            "Ljava/util/Set<",
            "Lcom/roblox/audio/a$a;",
            ">;)V"
        }
    .end annotation

    .line 1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "onAudioDeviceChanged: selectedAudioDevice: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string v0, "AppRtcDeviceWrapper"

    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const-string p2, "Placeholder until Log Audio State is implemented."

    .line 2
    invoke-static {v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 3
    iget-object p2, p0, Lcom/roblox/audio/AppRtcDeviceWrapper$b;->a:Lcom/roblox/audio/AppRtcDeviceWrapper;

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    iget-object v0, p0, Lcom/roblox/audio/AppRtcDeviceWrapper$b;->a:Lcom/roblox/audio/AppRtcDeviceWrapper;

    invoke-static {v0}, Lcom/roblox/audio/AppRtcDeviceWrapper;->access$000(Lcom/roblox/audio/AppRtcDeviceWrapper;)J

    move-result-wide v0

    invoke-static {p2, p1, v0, v1}, Lcom/roblox/audio/AppRtcDeviceWrapper;->access$100(Lcom/roblox/audio/AppRtcDeviceWrapper;IJ)V

    return-void
.end method
