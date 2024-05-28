.class Lf9/b$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnKeyListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lf9/b;->s(Landroid/view/SurfaceView;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Lf9/b;


# direct methods
.method constructor <init>(Lf9/b;)V
    .locals 0

    iput-object p1, p0, Lf9/b$c;->n:Lf9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 5

    const/16 p1, 0x52

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p2, p1, :cond_0

    const/16 p1, 0x60

    if-eq p2, p1, :cond_4

    const/16 p1, 0x61

    if-eq p2, p1, :cond_4

    const/16 p1, 0x63

    if-eq p2, p1, :cond_4

    const/16 p1, 0x64

    if-eq p2, p1, :cond_4

    packed-switch p2, :pswitch_data_0

    packed-switch p2, :pswitch_data_1

    goto :goto_3

    .line 1
    :cond_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getDevice()Landroid/view/InputDevice;

    move-result-object v2

    if-nez v2, :cond_1

    return v1

    :cond_1
    const v3, 0x1000411

    .line 2
    invoke-virtual {v2}, Landroid/view/InputDevice;->getSources()I

    move-result v4

    and-int/2addr v4, v3

    if-ne v4, v3, :cond_2

    const/4 v3, 0x1

    goto :goto_0

    :cond_2
    const/4 v3, 0x0

    :goto_0
    const/16 v4, 0x6c

    if-eqz v3, :cond_3

    new-array v3, v0, [I

    aput v4, v3, v1

    .line 3
    invoke-virtual {v2, v3}, Landroid/view/InputDevice;->hasKeys([I)[Z

    move-result-object v2

    .line 4
    aget-boolean v2, v2, v1

    if-nez v2, :cond_3

    const/16 p2, 0x6c

    :cond_3
    if-ne p2, p1, :cond_4

    return v1

    .line 5
    :cond_4
    :pswitch_0
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getSource()I

    move-result p1

    const/16 v2, 0x401

    and-int/2addr p1, v2

    if-eq p1, v2, :cond_6

    .line 6
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getSource()I

    move-result p1

    const v2, 0x1000010

    and-int/2addr p1, v2

    if-ne p1, v2, :cond_5

    goto :goto_1

    :cond_5
    const/4 p1, 0x0

    goto :goto_2

    :cond_6
    :goto_1
    const/4 p1, 0x1

    :goto_2
    if-eqz p1, :cond_8

    .line 7
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result p1

    if-nez p1, :cond_7

    const/4 v1, 0x1

    .line 8
    :cond_7
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getDeviceId()I

    move-result p1

    .line 9
    iget-object p3, p0, Lf9/b$c;->n:Lf9/b;

    invoke-static {p3, p1}, Lf9/b;->d(Lf9/b;I)V

    .line 10
    invoke-static {p1, p2, v1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativeGamepadButtonEvent(III)V

    goto :goto_4

    :cond_8
    :goto_3
    const/4 v0, 0x0

    :goto_4
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x13
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x66
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
