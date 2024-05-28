.class public final Landroidx/camera/view/PreviewView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/view/PreviewView$c;,
        Landroidx/camera/view/PreviewView$e;,
        Landroidx/camera/view/PreviewView$g;,
        Landroidx/camera/view/PreviewView$f;,
        Landroidx/camera/view/PreviewView$d;
    }
.end annotation


# static fields
.field private static final A:Landroidx/camera/view/PreviewView$d;


# instance fields
.field n:Landroidx/camera/view/PreviewView$d;

.field o:Landroidx/camera/view/k;

.field final p:Landroidx/camera/view/f;

.field q:Z

.field final r:Landroidx/lifecycle/r;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/r<",
            "Landroidx/camera/view/PreviewView$g;",
            ">;"
        }
    .end annotation
.end field

.field final s:Ljava/util/concurrent/atomic/AtomicReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReference<",
            "Landroidx/camera/view/e;",
            ">;"
        }
    .end annotation
.end field

.field t:Landroidx/camera/view/l;

.field private final u:Landroid/view/ScaleGestureDetector;

.field v:Lw/b0;

.field private w:Landroid/view/MotionEvent;

.field private final x:Landroidx/camera/view/PreviewView$c;

.field private final y:Landroid/view/View$OnLayoutChangeListener;

.field final z:Landroidx/camera/core/z1$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Landroidx/camera/view/PreviewView$d;->o:Landroidx/camera/view/PreviewView$d;

    sput-object v0, Landroidx/camera/view/PreviewView;->A:Landroidx/camera/view/PreviewView$d;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, p3, v0}, Landroidx/camera/view/PreviewView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 10

    .line 3
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 4
    sget-object v0, Landroidx/camera/view/PreviewView;->A:Landroidx/camera/view/PreviewView$d;

    iput-object v0, p0, Landroidx/camera/view/PreviewView;->n:Landroidx/camera/view/PreviewView$d;

    .line 5
    new-instance v1, Landroidx/camera/view/f;

    invoke-direct {v1}, Landroidx/camera/view/f;-><init>()V

    iput-object v1, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/f;

    const/4 v2, 0x1

    .line 6
    iput-boolean v2, p0, Landroidx/camera/view/PreviewView;->q:Z

    .line 7
    new-instance v2, Landroidx/lifecycle/r;

    sget-object v3, Landroidx/camera/view/PreviewView$g;->n:Landroidx/camera/view/PreviewView$g;

    invoke-direct {v2, v3}, Landroidx/lifecycle/r;-><init>(Ljava/lang/Object;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->r:Landroidx/lifecycle/r;

    .line 8
    new-instance v2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {v2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 9
    new-instance v2, Landroidx/camera/view/l;

    invoke-direct {v2, v1}, Landroidx/camera/view/l;-><init>(Landroidx/camera/view/f;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->t:Landroidx/camera/view/l;

    .line 10
    new-instance v2, Landroidx/camera/view/PreviewView$c;

    invoke-direct {v2, p0}, Landroidx/camera/view/PreviewView$c;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->x:Landroidx/camera/view/PreviewView$c;

    .line 11
    new-instance v2, Landroidx/camera/view/g;

    invoke-direct {v2, p0}, Landroidx/camera/view/g;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->y:Landroid/view/View$OnLayoutChangeListener;

    .line 12
    new-instance v2, Landroidx/camera/view/PreviewView$a;

    invoke-direct {v2, p0}, Landroidx/camera/view/PreviewView$a;-><init>(Landroidx/camera/view/PreviewView;)V

    iput-object v2, p0, Landroidx/camera/view/PreviewView;->z:Landroidx/camera/core/z1$d;

    .line 13
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v2

    sget-object v5, Landroidx/camera/view/m;->a:[I

    invoke-virtual {v2, p2, v5, p3, p4}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v2

    move-object v3, p0

    move-object v4, p1

    move-object v6, p2

    move-object v7, v2

    move v8, p3

    move v9, p4

    .line 15
    invoke-static/range {v3 .. v9}, Landroidx/core/view/v;->o0(Landroid/view/View;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;II)V

    .line 16
    :try_start_0
    sget p2, Landroidx/camera/view/m;->c:I

    .line 17
    invoke-virtual {v1}, Landroidx/camera/view/f;->f()Landroidx/camera/view/PreviewView$f;

    move-result-object p3

    invoke-virtual {p3}, Landroidx/camera/view/PreviewView$f;->c()I

    move-result p3

    .line 18
    invoke-virtual {v2, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    .line 19
    invoke-static {p2}, Landroidx/camera/view/PreviewView$f;->b(I)Landroidx/camera/view/PreviewView$f;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/camera/view/PreviewView;->setScaleType(Landroidx/camera/view/PreviewView$f;)V

    .line 20
    sget p2, Landroidx/camera/view/m;->b:I

    .line 21
    invoke-virtual {v0}, Landroidx/camera/view/PreviewView$d;->c()I

    move-result p3

    .line 22
    invoke-virtual {v2, p2, p3}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result p2

    .line 23
    invoke-static {p2}, Landroidx/camera/view/PreviewView$d;->b(I)Landroidx/camera/view/PreviewView$d;

    move-result-object p2

    invoke-virtual {p0, p2}, Landroidx/camera/view/PreviewView;->setImplementationMode(Landroidx/camera/view/PreviewView$d;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 25
    new-instance p2, Landroid/view/ScaleGestureDetector;

    new-instance p3, Landroidx/camera/view/PreviewView$e;

    invoke-direct {p3, p0}, Landroidx/camera/view/PreviewView$e;-><init>(Landroidx/camera/view/PreviewView;)V

    invoke-direct {p2, p1, p3}, Landroid/view/ScaleGestureDetector;-><init>(Landroid/content/Context;Landroid/view/ScaleGestureDetector$OnScaleGestureListener;)V

    iput-object p2, p0, Landroidx/camera/view/PreviewView;->u:Landroid/view/ScaleGestureDetector;

    .line 26
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    if-nez p1, :cond_0

    .line 27
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object p1

    const p2, 0x106000c

    invoke-static {p1, p2}, Landroidx/core/content/a;->c(Landroid/content/Context;I)I

    move-result p1

    invoke-virtual {p0, p1}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V

    :cond_0
    return-void

    :catchall_0
    move-exception p1

    .line 28
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    .line 29
    throw p1
.end method

.method public static synthetic a(Landroidx/camera/view/PreviewView;Landroid/view/View;IIIIIIII)V
    .locals 0

    invoke-direct/range {p0 .. p9}, Landroidx/camera/view/PreviewView;->d(Landroid/view/View;IIIIIIII)V

    return-void
.end method

.method private b(Z)V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDisplay()Landroid/view/Display;

    .line 3
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getViewPort()Landroidx/camera/core/e3;

    return-void
.end method

.method private synthetic d(Landroid/view/View;IIIIIIII)V
    .locals 0

    sub-int/2addr p4, p2

    sub-int/2addr p8, p6

    const/4 p1, 0x1

    if-ne p4, p8, :cond_1

    sub-int/2addr p5, p3

    sub-int/2addr p9, p7

    if-eq p5, p9, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p2, 0x1

    :goto_1
    if-eqz p2, :cond_2

    .line 1
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->e()V

    .line 2
    invoke-direct {p0, p1}, Landroidx/camera/view/PreviewView;->b(Z)V

    :cond_2
    return-void
.end method

.method static f(Landroidx/camera/core/x2;Landroidx/camera/view/PreviewView$d;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroidx/camera/core/x2;->j()Lw/d0;

    move-result-object v0

    invoke-interface {v0}, Lw/d0;->h()Lw/b0;

    move-result-object v0

    .line 2
    invoke-interface {v0}, Landroidx/camera/core/r;->d()Ljava/lang/String;

    move-result-object v0

    const-string v1, "androidx.camera.camera2.legacy"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    .line 3
    const-class v1, Le0/d;

    invoke-static {v1}, Le0/a;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-nez v1, :cond_1

    const-class v1, Le0/c;

    .line 4
    invoke-static {v1}, Le0/a;->a(Ljava/lang/Class;)Lw/x1;

    move-result-object v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 5
    :goto_1
    invoke-virtual {p0}, Landroidx/camera/core/x2;->m()Z

    move-result p0

    if-nez p0, :cond_4

    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x18

    if-le p0, v4, :cond_4

    if-nez v0, :cond_4

    if-eqz v1, :cond_2

    goto :goto_2

    .line 6
    :cond_2
    sget-object p0, Landroidx/camera/view/PreviewView$b;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget p0, p0, v0

    if-eq p0, v3, :cond_4

    const/4 v0, 0x2

    if-ne p0, v0, :cond_3

    return v2

    .line 7
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid implementation mode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    :goto_2
    return v3
.end method

.method private g()V
    .locals 4

    .line 1
    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getDisplayManager()Landroid/hardware/display/DisplayManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->x:Landroidx/camera/view/PreviewView$c;

    new-instance v2, Landroid/os/Handler;

    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 4
    invoke-virtual {v0, v1, v2}, Landroid/hardware/display/DisplayManager;->registerDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;Landroid/os/Handler;)V

    return-void
.end method

.method private getDisplayManager()Landroid/hardware/display/DisplayManager;
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getContext()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "display"

    .line 3
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/display/DisplayManager;

    return-object v0
.end method

.method private getViewPortScaleType()I
    .locals 3

    .line 1
    sget-object v0, Landroidx/camera/view/PreviewView$b;->a:[I

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getScaleType()Landroidx/camera/view/PreviewView$f;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 2
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected scale type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->getScaleType()Landroidx/camera/view/PreviewView$f;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    const/4 v0, 0x3

    return v0

    :pswitch_1
    const/4 v0, 0x0

    return v0

    :pswitch_2
    const/4 v0, 0x1

    return v0

    :pswitch_3
    const/4 v0, 0x2

    return v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private h()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getDisplayManager()Landroid/hardware/display/DisplayManager;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    .line 2
    :cond_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->x:Landroidx/camera/view/PreviewView$c;

    invoke-virtual {v0, v1}, Landroid/hardware/display/DisplayManager;->unregisterDisplayListener(Landroid/hardware/display/DisplayManager$DisplayListener;)V

    return-void
.end method


# virtual methods
.method public c(I)Landroidx/camera/core/e3;
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    new-instance v0, Landroidx/camera/core/e3$a;

    new-instance v1, Landroid/util/Rational;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    invoke-direct {v0, v1, p1}, Landroidx/camera/core/e3$a;-><init>(Landroid/util/Rational;I)V

    .line 4
    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->getViewPortScaleType()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/camera/core/e3$a;->c(I)Landroidx/camera/core/e3$a;

    move-result-object p1

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutDirection()I

    move-result v0

    invoke-virtual {p1, v0}, Landroidx/camera/core/e3$a;->b(I)Landroidx/camera/core/e3$a;

    move-result-object p1

    .line 6
    invoke-virtual {p1}, Landroidx/camera/core/e3$a;->a()Landroidx/camera/core/e3;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method e()V
    .locals 4

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Landroidx/camera/view/k;

    if-eqz v0, :cond_0

    .line 3
    invoke-virtual {v0}, Landroidx/camera/view/k;->h()V

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->t:Landroidx/camera/view/l;

    new-instance v1, Landroid/util/Size;

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Size;-><init>(II)V

    .line 5
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutDirection()I

    move-result v2

    .line 6
    invoke-virtual {v0, v1, v2}, Landroidx/camera/view/l;->a(Landroid/util/Size;I)V

    return-void
.end method

.method public getBitmap()Landroid/graphics/Bitmap;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Landroidx/camera/view/k;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroidx/camera/view/k;->a()Landroid/graphics/Bitmap;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method public getController()Landroidx/camera/view/a;
    .locals 1

    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    const/4 v0, 0x0

    return-object v0
.end method

.method public getImplementationMode()Landroidx/camera/view/PreviewView$d;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->n:Landroidx/camera/view/PreviewView$d;

    return-object v0
.end method

.method public getMeteringPointFactory()Landroidx/camera/core/u1;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->t:Landroidx/camera/view/l;

    return-object v0
.end method

.method public getOutputTransform()Lf0/a;
    .locals 5

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    const/4 v0, 0x0

    .line 2
    :try_start_0
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/f;

    new-instance v2, Landroid/util/Size;

    .line 3
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getLayoutDirection()I

    move-result v3

    .line 4
    invoke-virtual {v1, v2, v3}, Landroidx/camera/view/f;->h(Landroid/util/Size;I)Landroid/graphics/Matrix;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v1, v0

    .line 5
    :goto_0
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/f;

    invoke-virtual {v2}, Landroidx/camera/view/f;->g()Landroid/graphics/Rect;

    move-result-object v2

    const-string v3, "PreviewView"

    if-eqz v1, :cond_2

    if-nez v2, :cond_0

    goto :goto_2

    .line 6
    :cond_0
    invoke-static {v2}, Landroidx/camera/view/y;->a(Landroid/graphics/Rect;)Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->preConcat(Landroid/graphics/Matrix;)Z

    .line 7
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Landroidx/camera/view/k;

    instance-of v0, v0, Landroidx/camera/view/x;

    if-eqz v0, :cond_1

    .line 8
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getMatrix()Landroid/graphics/Matrix;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    goto :goto_1

    :cond_1
    const-string v0, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly."

    .line 9
    invoke-static {v3, v0}, Landroidx/camera/core/q1;->k(Ljava/lang/String;Ljava/lang/String;)V

    .line 10
    :goto_1
    new-instance v0, Lf0/a;

    new-instance v3, Landroid/util/Size;

    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    move-result v4

    .line 11
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    invoke-direct {v3, v4, v2}, Landroid/util/Size;-><init>(II)V

    invoke-direct {v0, v1, v3}, Lf0/a;-><init>(Landroid/graphics/Matrix;Landroid/util/Size;)V

    return-object v0

    :cond_2
    :goto_2
    const-string v1, "Transform info is not ready"

    .line 12
    invoke-static {v3, v1}, Landroidx/camera/core/q1;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public getPreviewStreamState()Landroidx/lifecycle/LiveData;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroidx/lifecycle/LiveData<",
            "Landroidx/camera/view/PreviewView$g;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Landroidx/camera/view/PreviewView;->r:Landroidx/lifecycle/r;

    return-object v0
.end method

.method public getScaleType()Landroidx/camera/view/PreviewView$f;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/f;

    invoke-virtual {v0}, Landroidx/camera/view/f;->f()Landroidx/camera/view/PreviewView$f;

    move-result-object v0

    return-object v0
.end method

.method public getSurfaceProvider()Landroidx/camera/core/z1$d;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->z:Landroidx/camera/core/z1$d;

    return-object v0
.end method

.method public getViewPort()Landroidx/camera/core/e3;
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    .line 3
    :cond_0
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    invoke-virtual {p0, v0}, Landroidx/camera/view/PreviewView;->c(I)Landroidx/camera/core/e3;

    move-result-object v0

    return-object v0
.end method

.method i()V
    .locals 4

    .line 1
    iget-boolean v0, p0, Landroidx/camera/view/PreviewView;->q:Z

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/widget/FrameLayout;->getDisplay()Landroid/view/Display;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/camera/view/PreviewView;->v:Lw/b0;

    if-eqz v1, :cond_0

    .line 4
    iget-object v2, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/f;

    .line 5
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v3

    .line 6
    invoke-interface {v1, v3}, Landroidx/camera/core/r;->e(I)I

    move-result v1

    .line 7
    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    .line 8
    invoke-virtual {v2, v1, v0}, Landroidx/camera/view/f;->m(II)V

    :cond_0
    return-void
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onAttachedToWindow()V

    .line 2
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->i()V

    .line 3
    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->g()V

    .line 4
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->y:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 5
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Landroidx/camera/view/k;

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {v0}, Landroidx/camera/view/k;->d()V

    :cond_0
    const/4 v0, 0x1

    .line 7
    invoke-direct {p0, v0}, Landroidx/camera/view/PreviewView;->b(Z)V

    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .line 1
    invoke-super {p0}, Landroid/widget/FrameLayout;->onDetachedFromWindow()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->y:Landroid/view/View$OnLayoutChangeListener;

    invoke-virtual {p0, v0}, Landroid/widget/FrameLayout;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 3
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->o:Landroidx/camera/view/k;

    if-eqz v0, :cond_0

    .line 4
    invoke-virtual {v0}, Landroidx/camera/view/k;->e()V

    .line 5
    :cond_0
    invoke-direct {p0}, Landroidx/camera/view/PreviewView;->h()V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 0

    invoke-super {p0, p1}, Landroid/widget/FrameLayout;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public performClick()Z
    .locals 1

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Landroidx/camera/view/PreviewView;->w:Landroid/view/MotionEvent;

    .line 2
    invoke-super {p0}, Landroid/widget/FrameLayout;->performClick()Z

    move-result v0

    return v0
.end method

.method public setController(Landroidx/camera/view/a;)V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    const/4 p1, 0x0

    .line 2
    invoke-direct {p0, p1}, Landroidx/camera/view/PreviewView;->b(Z)V

    return-void
.end method

.method public setImplementationMode(Landroidx/camera/view/PreviewView$d;)V
    .locals 0

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iput-object p1, p0, Landroidx/camera/view/PreviewView;->n:Landroidx/camera/view/PreviewView$d;

    return-void
.end method

.method public setScaleType(Landroidx/camera/view/PreviewView$f;)V
    .locals 1

    .line 1
    invoke-static {}, Landroidx/camera/core/impl/utils/l;->a()V

    .line 2
    iget-object v0, p0, Landroidx/camera/view/PreviewView;->p:Landroidx/camera/view/f;

    invoke-virtual {v0, p1}, Landroidx/camera/view/f;->o(Landroidx/camera/view/PreviewView$f;)V

    .line 3
    invoke-virtual {p0}, Landroidx/camera/view/PreviewView;->e()V

    const/4 p1, 0x0

    .line 4
    invoke-direct {p0, p1}, Landroidx/camera/view/PreviewView;->b(Z)V

    return-void
.end method
