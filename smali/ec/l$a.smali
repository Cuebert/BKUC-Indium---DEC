.class Lec/l$a;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lec/l;->C()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lec/l;


# direct methods
.method constructor <init>(Lec/l;)V
    .locals 0

    iput-object p1, p0, Lec/l$a;->a:Lec/l;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onAudioDevicesAdded"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x1

    .line 2
    invoke-static {p1, v1}, Lfc/a;->m([Landroid/media/AudioDeviceInfo;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Lec/l$a;->a:Lec/l;

    invoke-static {v1}, Lec/l;->h(Lec/l;)V

    .line 4
    :cond_0
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->M()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    .line 5
    invoke-static {p1, v1}, Lfc/a;->m([Landroid/media/AudioDeviceInfo;Z)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lec/l$a;->a:Lec/l;

    .line 6
    invoke-static {p1}, Lec/l;->b(Lec/l;)Lec/l$e;

    move-result-object p1

    sget-object v1, Lec/l$e;->s:Lec/l$e;

    if-ne p1, v1, :cond_1

    const-string p1, "SCO_CONNECTED state but device in A2DP. Reconnecting..."

    .line 7
    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 8
    iget-object p1, p0, Lec/l$a;->a:Lec/l;

    sget-object v0, Lec/l$e;->p:Lec/l$e;

    invoke-static {p1, v0}, Lec/l;->c(Lec/l;Lec/l$e;)Lec/l$e;

    .line 9
    iget-object p1, p0, Lec/l$a;->a:Lec/l;

    invoke-static {p1}, Lec/l;->h(Lec/l;)V

    :cond_1
    return-void
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 2

    const-string v0, "AppRtcBluetoothMgr"

    const-string v1, "onAudioDevicesRemoved"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    .line 2
    invoke-static {p1, v0}, Lfc/a;->m([Landroid/media/AudioDeviceInfo;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    iget-object p1, p0, Lec/l$a;->a:Lec/l;

    invoke-static {p1}, Lec/l;->i(Lec/l;)V

    :cond_0
    return-void
.end method
