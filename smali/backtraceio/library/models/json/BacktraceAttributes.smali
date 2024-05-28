.class public Lbacktraceio/library/models/json/BacktraceAttributes;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final transient LOG_TAG:Ljava/lang/String; = "BacktraceAttributes"

.field private static isMetricsEnabled:Z

.field private static sessionId:Ljava/lang/String;


# instance fields
.field public attributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final complexAttributes:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final context:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lbacktraceio/library/models/json/BacktraceReport;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    .line 4
    iput-object p1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    if-eqz p2, :cond_0

    .line 5
    invoke-direct {p0, p2}, Lbacktraceio/library/models/json/BacktraceAttributes;->convertReportAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V

    .line 6
    invoke-direct {p0, p2}, Lbacktraceio/library/models/json/BacktraceAttributes;->setExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V

    :cond_0
    if-eqz p3, :cond_1

    .line 7
    invoke-direct {p0, p3}, Lbacktraceio/library/models/json/BacktraceAttributes;->convertClientAttributes(Ljava/util/Map;)V

    :cond_1
    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    .line 8
    invoke-static {p2, p3}, Lbacktraceio/library/models/json/BacktraceReport;->concatAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)Ljava/util/Map;

    .line 9
    :cond_2
    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->setAppInformation()V

    .line 10
    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->setDeviceInformation()V

    .line 11
    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->setScreenInformation()V

    .line 12
    sget-boolean p1, Lbacktraceio/library/models/json/BacktraceAttributes;->isMetricsEnabled:Z

    if-eqz p1, :cond_3

    .line 13
    iget-object p1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget-object p2, Lbacktraceio/library/models/json/BacktraceAttributes;->sessionId:Ljava/lang/String;

    const-string p3, "application.session"

    invoke-interface {p1, p3, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method private convertAttributes(Ljava/util/Map;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 2
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    .line 4
    invoke-static {v2}, Lbacktraceio/library/common/TypeHelper;->isPrimitiveOrPrimitiveWrapperOrString(Ljava/lang/Class;)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 5
    iget-object v2, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 6
    :cond_1
    iget-object v2, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method private convertClientAttributes(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lbacktraceio/library/models/json/BacktraceAttributes;->convertAttributes(Ljava/util/Map;)V

    return-void
.end method

.method private convertReportAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-static {p1, v0}, Lbacktraceio/library/models/json/BacktraceReport;->concatAttributes(Lbacktraceio/library/models/json/BacktraceReport;Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 2
    invoke-direct {p0, v0}, Lbacktraceio/library/models/json/BacktraceAttributes;->convertAttributes(Ljava/util/Map;)V

    .line 3
    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 4
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    const-string v1, "Exception properties"

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public static enableMetrics()V
    .locals 1

    const/4 v0, 0x1

    .line 1
    sput-boolean v0, Lbacktraceio/library/models/json/BacktraceAttributes;->isMetricsEnabled:Z

    .line 2
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3
    sput-object v0, Lbacktraceio/library/models/json/BacktraceAttributes;->sessionId:Ljava/lang/String;

    return-void
.end method

.method private getScreenBrightness()I
    .locals 3

    .line 1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    .line 2
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "screen_brightness"

    const/4 v2, 0x0

    .line 3
    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private getScreenOrientation()Lbacktraceio/library/enums/ScreenOrientation;
    .locals 2

    .line 1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 2
    sget-object v0, Lbacktraceio/library/enums/ScreenOrientation;->PORTRAIT:Lbacktraceio/library/enums/ScreenOrientation;

    return-object v0

    :cond_0
    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    .line 3
    sget-object v0, Lbacktraceio/library/enums/ScreenOrientation;->LANDSCAPE:Lbacktraceio/library/enums/ScreenOrientation;

    return-object v0

    .line 4
    :cond_1
    sget-object v0, Lbacktraceio/library/enums/ScreenOrientation;->UNDEFINED:Lbacktraceio/library/enums/ScreenOrientation;

    return-object v0
.end method

.method private setAppInformation()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    .line 2
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "application.package"

    .line 3
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-virtual {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->getApplicationName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "application"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    invoke-virtual {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->getApplicationVersionOrEmpty()Ljava/lang/String;

    move-result-object v0

    .line 6
    invoke-static {v0}, Lbacktraceio/library/common/BacktraceStringHelper;->isNullOrEmpty(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 7
    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v2, "application.version"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v2, "version"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method private setDeviceInformation()V
    .locals 3

    .line 1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    const-string v2, "uname.version"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;

    move-result-object v1

    const-string v2, "culture"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "build.type"

    const-string v2, "Release"

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    const-string v2, "device.model"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget-object v1, Landroid/os/Build;->BRAND:Ljava/lang/String;

    const-string v2, "device.brand"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget-object v1, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    const-string v2, "device.product"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device.sdk"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    sget-object v1, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    const-string v2, "device.manufacturer"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    const-string v1, "os.version"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "device.os_version"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    new-instance v0, Lbacktraceio/library/common/DeviceAttributesHelper;

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-direct {v0, v1}, Lbacktraceio/library/common/DeviceAttributesHelper;-><init>(Landroid/content/Context;)V

    .line 11
    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-virtual {v0}, Lbacktraceio/library/common/DeviceAttributesHelper;->getDeviceAttributes()Ljava/util/HashMap;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method private setExceptionAttributes(Lbacktraceio/library/models/json/BacktraceReport;)V
    .locals 4

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-object v0, p1, Lbacktraceio/library/models/json/BacktraceReport;->exceptionTypeReport:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const-string v1, "error.message"

    if-nez v0, :cond_1

    .line 2
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->message:Ljava/lang/String;

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 3
    :cond_1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget-object v2, p1, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    const-string v3, "classifier"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget-object p1, p1, Lbacktraceio/library/models/json/BacktraceReport;->exception:Ljava/lang/Exception;

    invoke-virtual {p1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private setScreenInformation()V
    .locals 4

    .line 1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    .line 2
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 3
    new-instance v1, Landroid/util/DisplayMetrics;

    invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V

    .line 4
    invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 5
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget v2, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "screen.width"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget v2, v1, Landroid/util/DisplayMetrics;->heightPixels:I

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "screen.height"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    iget v1, v1, Landroid/util/DisplayMetrics;->densityDpi:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "screen.dpi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->getScreenOrientation()Lbacktraceio/library/enums/ScreenOrientation;

    move-result-object v1

    invoke-virtual {v1}, Lbacktraceio/library/enums/ScreenOrientation;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "screen.orientation"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-direct {p0}, Lbacktraceio/library/models/json/BacktraceAttributes;->getScreenBrightness()I

    move-result v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "screen.brightness"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public getAllAttributes()Ljava/util/Map;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->attributes:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 3
    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public getApplicationName()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    .line 2
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/pm/ApplicationInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 4
    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public getApplicationVersionOrEmpty()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->context:Landroid/content/Context;

    .line 2
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/PackageInfo;->versionName:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    .line 3
    sget-object v1, Lbacktraceio/library/models/json/BacktraceAttributes;->LOG_TAG:Ljava/lang/String;

    const-string v2, "Could not resolve application version"

    invoke-static {v1, v2}, Lbacktraceio/library/logger/BacktraceLogger;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V

    const-string v0, ""

    return-object v0
.end method

.method public getComplexAttributes()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lbacktraceio/library/models/json/BacktraceAttributes;->complexAttributes:Ljava/util/Map;

    return-object v0
.end method
