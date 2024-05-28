.class Lf9/b$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnGenericMotionListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf9/b;->s(Landroid/view/SurfaceView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field a:[F

.field final synthetic b:Lf9/b;


# direct methods
.method constructor <init>(Lf9/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf9/b$d;->b:Lf9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x8

    new-array p1, p1, [F

    .line 2
    iput-object p1, p0, Lf9/b$d;->a:[F

    return-void
.end method

.method private a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    move-result v0

    invoke-virtual {p2, p3, v0}, Landroid/view/InputDevice;->getMotionRange(II)Landroid/view/InputDevice$MotionRange;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 2
    invoke-virtual {p2}, Landroid/view/InputDevice$MotionRange;->getFlat()F

    move-result p2

    if-gez p4, :cond_0

    .line 3
    invoke-virtual {p1, p3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p3, p4}, Landroid/view/MotionEvent;->getHistoricalAxisValue(II)F

    move-result p1

    .line 4
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p2, p3, p2

    if-lez p2, :cond_1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private b(Landroid/view/MotionEvent;I)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Lf9/b$d;->a:[F

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v2, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v3

    aput v3, v1, v2

    .line 3
    iget-object v1, p0, Lf9/b$d;->a:[F

    const/4 v2, 0x1

    invoke-direct {p0, p1, v0, v2, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v3

    aput v3, v1, v2

    .line 4
    iget-object v1, p0, Lf9/b$d;->a:[F

    const/4 v2, 0x2

    const/16 v3, 0xb

    invoke-direct {p0, p1, v0, v3, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v3

    aput v3, v1, v2

    .line 5
    iget-object v1, p0, Lf9/b$d;->a:[F

    const/4 v2, 0x3

    const/16 v3, 0xe

    invoke-direct {p0, p1, v0, v3, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v3

    aput v3, v1, v2

    const/16 v1, 0x11

    .line 6
    invoke-direct {p0, p1, v0, v1, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v1

    const/16 v2, 0x17

    .line 7
    invoke-direct {p0, p1, v0, v2, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v2

    .line 8
    iget-object v3, p0, Lf9/b$d;->a:[F

    const/4 v4, 0x4

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    aput v1, v3, v4

    const/16 v1, 0x12

    .line 9
    invoke-direct {p0, p1, v0, v1, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v1

    const/16 v2, 0x16

    .line 10
    invoke-direct {p0, p1, v0, v2, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v2

    .line 11
    iget-object v3, p0, Lf9/b$d;->a:[F

    const/4 v4, 0x5

    invoke-static {v1, v2}, Ljava/lang/Math;->max(FF)F

    move-result v1

    aput v1, v3, v4

    .line 12
    iget-object v1, p0, Lf9/b$d;->a:[F

    const/4 v2, 0x6

    const/16 v3, 0xf

    invoke-direct {p0, p1, v0, v3, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result v3

    aput v3, v1, v2

    .line 13
    iget-object v1, p0, Lf9/b$d;->a:[F

    const/4 v2, 0x7

    const/16 v3, 0x10

    invoke-direct {p0, p1, v0, v3, p2}, Lf9/b$d;->a(Landroid/view/MotionEvent;Landroid/view/InputDevice;II)F

    move-result p1

    aput p1, v1, v2

    return-void
.end method


# virtual methods
.method public onGenericMotion(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 6

    .line 1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const/16 v0, 0x2002

    and-int/2addr p1, v0

    if-eq p1, v0, :cond_4

    .line 2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const v0, 0x100008

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    goto/16 :goto_3

    .line 3
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const/16 v0, 0x401

    and-int/2addr p1, v0

    const/4 v1, 0x0

    if-eq p1, v0, :cond_1

    .line 4
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getSource()I

    move-result p1

    const v0, 0x1000010

    and-int/2addr p1, v0

    if-eq p1, v0, :cond_1

    return v1

    .line 5
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getHistorySize()I

    move-result p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_2

    .line 6
    invoke-direct {p0, p2, v0}, Lf9/b$d;->b(Landroid/view/MotionEvent;I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    .line 7
    invoke-direct {p0, p2, p1}, Lf9/b$d;->b(Landroid/view/MotionEvent;I)V

    .line 8
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getDeviceId()I

    move-result p1

    .line 9
    iget-object p2, p0, Lf9/b$d;->b:Lf9/b;

    invoke-static {p2, p1}, Lf9/b;->d(Lf9/b;I)V

    const/4 p2, 0x0

    .line 10
    :goto_1
    iget-object v0, p0, Lf9/b$d;->a:[F

    array-length v2, v0

    const/4 v3, 0x1

    if-ge p2, v2, :cond_3

    const/4 v2, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch p2, :pswitch_data_0

    goto :goto_2

    :pswitch_0
    const/16 v2, 0x10

    const/4 v3, 0x7

    .line 11
    aget v0, v0, v3

    neg-float v0, v0

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_1
    const/16 v2, 0xf

    const/4 v3, 0x6

    .line 12
    aget v0, v0, v3

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_2
    const/16 v2, 0x12

    const/4 v3, 0x5

    .line 13
    aget v0, v0, v3

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_3
    const/16 v2, 0x11

    const/4 v3, 0x4

    .line 14
    aget v0, v0, v3

    invoke-static {p1, v2, v5, v5, v0}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_4
    const/16 v3, 0xe

    .line 15
    aget v4, v0, v4

    aget v0, v0, v2

    neg-float v0, v0

    invoke-static {p1, v3, v4, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    :pswitch_5
    const/16 v3, 0xb

    .line 16
    aget v4, v0, v4

    aget v0, v0, v2

    neg-float v0, v0

    invoke-static {p1, v3, v4, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    .line 17
    :pswitch_6
    aget v2, v0, v1

    aget v0, v0, v3

    neg-float v0, v0

    invoke-static {p1, v3, v2, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    goto :goto_2

    .line 18
    :pswitch_7
    aget v2, v0, v1

    aget v0, v0, v3

    neg-float v0, v0

    invoke-static {p1, v1, v2, v0, v5}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadAxisEvent(IIFFF)V

    :goto_2
    add-int/lit8 p2, p2, 0x1

    goto :goto_1

    :cond_3
    return v3

    .line 19
    :cond_4
    :goto_3
    iget-object p1, p0, Lf9/b$d;->b:Lf9/b;

    invoke-virtual {p1, p2}, Lf9/b;->l(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
