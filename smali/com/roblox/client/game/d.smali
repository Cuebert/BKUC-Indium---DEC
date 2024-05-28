.class public Lcom/roblox/client/game/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;

.field private b:Lf9/e;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    .line 3
    new-instance p1, Lf9/e;

    invoke-direct {p1}, Lf9/e;-><init>()V

    iput-object p1, p0, Lcom/roblox/client/game/d;->b:Lf9/e;

    return-void
.end method

.method public static a(Landroid/content/Context;)Lcom/roblox/client/game/b$d;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lcom/roblox/client/game/d;->b(Landroid/content/Context;Landroid/app/Activity;)Lcom/roblox/client/game/b$d;

    move-result-object p0

    return-object p0
.end method

.method public static b(Landroid/content/Context;Landroid/app/Activity;)Lcom/roblox/client/game/b$d;
    .locals 4

    .line 1
    new-instance v0, Lcom/roblox/client/game/d;

    invoke-direct {v0, p0}, Lcom/roblox/client/game/d;-><init>(Landroid/content/Context;)V

    .line 2
    new-instance p0, Lcom/roblox/engine/jni/model/a;

    invoke-virtual {v0}, Lcom/roblox/client/game/d;->f()Lcom/roblox/engine/jni/model/PlatformParams;

    move-result-object v1

    invoke-direct {p0, v1}, Lcom/roblox/engine/jni/model/a;-><init>(Lcom/roblox/engine/jni/model/PlatformParams;)V

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, p0, Lcom/roblox/engine/jni/model/a;->isLuaHomePageEnabled:Z

    .line 4
    iput-boolean v1, p0, Lcom/roblox/engine/jni/model/a;->isLuaGamesPageEnabled:Z

    .line 5
    iput-boolean v1, p0, Lcom/roblox/engine/jni/model/a;->isLuaChatEnabled:Z

    .line 6
    invoke-static {}, Lcom/roblox/client/p0;->o0()Z

    move-result v1

    iput-boolean v1, p0, Lcom/roblox/engine/jni/model/a;->isTablet:Z

    .line 7
    invoke-virtual {v0}, Lcom/roblox/client/game/d;->e()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object v0

    .line 8
    new-instance v1, Lcom/roblox/client/game/b$d;

    invoke-direct {v1}, Lcom/roblox/client/game/b$d;-><init>()V

    .line 9
    iput-object p0, v1, Lcom/roblox/client/game/b$d;->b:Lcom/roblox/engine/jni/model/PlatformParams;

    .line 10
    iput-object v0, v1, Lcom/roblox/client/game/b$d;->c:Lcom/roblox/engine/jni/model/DeviceParams;

    const-string p0, "rbxasset://places/Mobile.rbxl"

    .line 11
    iput-object p0, v1, Lcom/roblox/client/game/b$d;->d:Ljava/lang/String;

    const-string p0, "LuaAppStarterScript"

    .line 12
    iput-object p0, v1, Lcom/roblox/client/game/b$d;->e:Ljava/lang/String;

    .line 13
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p0

    invoke-virtual {p0}, Lb9/c;->j()J

    move-result-wide v2

    iput-wide v2, v1, Lcom/roblox/client/game/b$d;->f:J

    .line 14
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p0

    invoke-virtual {p0}, Lb9/c;->m()Z

    move-result p0

    iput-boolean p0, v1, Lcom/roblox/client/game/b$d;->g:Z

    .line 15
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p0

    invoke-virtual {p0}, Lb9/c;->k()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lcom/roblox/client/game/b$d;->h:Ljava/lang/String;

    .line 16
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p0

    invoke-virtual {p0}, Lb9/c;->d()I

    move-result p0

    iput p0, v1, Lcom/roblox/client/game/b$d;->i:I

    .line 17
    invoke-static {}, Lb9/c;->c()Lb9/c;

    move-result-object p0

    invoke-virtual {p0}, Lb9/c;->i()Ljava/lang/String;

    move-result-object p0

    iput-object p0, v1, Lcom/roblox/client/game/b$d;->j:Ljava/lang/String;

    .line 18
    iput-object p1, v1, Lcom/roblox/client/game/b$d;->a:Landroid/app/Activity;

    return-object v1
.end method

.method public static c(Landroid/content/Context;)Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 1

    .line 1
    new-instance v0, Lcom/roblox/client/game/d;

    invoke-direct {v0, p0}, Lcom/roblox/client/game/d;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-virtual {v0}, Lcom/roblox/client/game/d;->e()Lcom/roblox/engine/jni/model/DeviceParams;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public d()F
    .locals 2

    iget-object v0, p0, Lcom/roblox/client/game/d;->b:Lf9/e;

    iget-object v1, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lf9/e;->b(Landroid/content/Context;)F

    move-result v0

    return v0
.end method

.method public e()Lcom/roblox/engine/jni/model/DeviceParams;
    .locals 4

    .line 1
    new-instance v0, Lcom/roblox/engine/jni/model/DeviceParams;

    invoke-direct {v0}, Lcom/roblox/engine/jni/model/DeviceParams;-><init>()V

    .line 2
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->osVersion:Ljava/lang/String;

    .line 3
    invoke-static {}, Lcom/roblox/client/m;->b()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->deviceName:Ljava/lang/String;

    .line 4
    invoke-static {}, Lcom/roblox/client/p0;->f1()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->appVersion:Ljava/lang/String;

    .line 5
    invoke-static {}, Ls7/b;->f()Ls7/b;

    move-result-object v1

    invoke-virtual {v1}, Ls7/b;->e()Ljava/util/Locale;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 6
    invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->country:Ljava/lang/String;

    .line 7
    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->manufacturer:Ljava/lang/String;

    .line 8
    invoke-static {}, Lx9/a;->b()I

    move-result v1

    iput v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->deviceTotalMemoryMB:I

    .line 9
    iget-object v1, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/roblox/client/d1;->h(Landroid/content/Context;)Landroid/graphics/Point;

    move-result-object v1

    .line 10
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget v3, v1, Landroid/graphics/Point;->x:I

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, v1, Landroid/graphics/Point;->y:I

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->displayResolution:Ljava/lang/String;

    .line 11
    iget-object v1, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-static {v1}, Lcom/roblox/client/d1;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->networkType:Ljava/lang/String;

    .line 12
    iget-object v1, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/roblox/client/d1;->a(Landroid/content/Context;Lcom/roblox/engine/jni/model/DeviceParams;)V

    .line 13
    invoke-static {}, Lc7/c;->a()Lc7/e;

    move-result-object v1

    invoke-interface {v1}, Lc7/e;->Q0()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 14
    invoke-static {}, Lcom/roblox/client/p0;->i0()Z

    move-result v1

    iput-boolean v1, v0, Lcom/roblox/engine/jni/model/DeviceParams;->isChrome:Z

    :cond_1
    return-object v0
.end method

.method public f()Lcom/roblox/engine/jni/model/PlatformParams;
    .locals 3

    .line 1
    invoke-static {}, Lf9/g;->g()Ljava/lang/String;

    move-result-object v0

    .line 2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-static {}, Lf9/g;->i()Lf9/g;

    move-result-object v0

    iget-object v1, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lf9/g;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 4
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getPlatformParams: assetFolderPath = "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "DataModelParamsCreator"

    invoke-static {v2, v1}, Lc9/k;->a(Ljava/lang/String;Ljava/lang/String;)I

    .line 5
    new-instance v1, Lcom/roblox/engine/jni/model/PlatformParams;

    invoke-direct {v1}, Lcom/roblox/engine/jni/model/PlatformParams;-><init>()V

    .line 6
    iput-object v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->assetFolderPath:Ljava/lang/String;

    .line 7
    iget-object v0, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.touchscreen"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isTouchDevice:Z

    .line 8
    iget-object v0, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    const-string v2, "android.hardware.type.pc"

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isMouseDevice:Z

    .line 9
    iget-object v0, p0, Lcom/roblox/client/game/d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->isKeyboardDevice:Z

    .line 10
    invoke-virtual {p0}, Lcom/roblox/client/game/d;->d()F

    move-result v0

    iput v0, v1, Lcom/roblox/engine/jni/model/PlatformParams;->dpiScale:F

    return-object v1
.end method
