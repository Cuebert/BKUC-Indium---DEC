.class public Lf7/k0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Landroid/content/Context;

.field private b:Landroid/os/PowerManager$OnThermalStatusChangedListener;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lf7/k0;->a:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_2

    .line 2
    iget-object v0, p0, Lf7/k0;->a:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, p0, Lf7/k0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    if-eqz v1, :cond_1

    .line 4
    invoke-virtual {v0, v1}, Landroid/os/PowerManager;->removeThermalStatusListener(Landroid/os/PowerManager$OnThermalStatusChangedListener;)V

    .line 5
    :cond_1
    invoke-virtual {v0}, Landroid/os/PowerManager;->getCurrentThermalStatus()I

    move-result v1

    invoke-static {v1}, Lcom/roblox/engine/jni/NativeGLInterface;->reportThermalStateChanged(I)V

    const-string v1, "ThermalStatusObserver"

    const-string v2, "startObserving"

    .line 6
    invoke-static {v1, v2}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 7
    new-instance v1, Lf7/k0$a;

    invoke-direct {v1, p0}, Lf7/k0$a;-><init>(Lf7/k0;)V

    iput-object v1, p0, Lf7/k0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    .line 8
    invoke-virtual {v0, v1}, Landroid/os/PowerManager;->addThermalStatusListener(Landroid/os/PowerManager$OnThermalStatusChangedListener;)V

    :cond_2
    return-void
.end method

.method public b()V
    .locals 2

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_1

    .line 2
    iget-object v0, p0, Lf7/k0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    if-eqz v0, :cond_1

    const-string v0, "ThermalStatusObserver"

    const-string v1, "stopObserving"

    .line 3
    invoke-static {v0, v1}, Lc9/k;->f(Ljava/lang/String;Ljava/lang/String;)I

    .line 4
    iget-object v0, p0, Lf7/k0;->a:Landroid/content/Context;

    const-string v1, "power"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/PowerManager;

    if-nez v0, :cond_0

    return-void

    .line 5
    :cond_0
    iget-object v1, p0, Lf7/k0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    if-eqz v1, :cond_1

    .line 6
    invoke-virtual {v0, v1}, Landroid/os/PowerManager;->removeThermalStatusListener(Landroid/os/PowerManager$OnThermalStatusChangedListener;)V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lf7/k0;->b:Landroid/os/PowerManager$OnThermalStatusChangedListener;

    const/4 v0, -0x1

    .line 8
    invoke-static {v0}, Lcom/roblox/engine/jni/NativeGLInterface;->reportThermalStateChanged(I)V

    :cond_1
    return-void
.end method
