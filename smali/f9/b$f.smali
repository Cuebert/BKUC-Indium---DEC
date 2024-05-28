.class final Lf9/b$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "f"
.end annotation


# instance fields
.field public a:I

.field public b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field final synthetic g:Lf9/b;


# direct methods
.method private constructor <init>(Lf9/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lf9/b$f;->g:Lf9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, -0x1

    .line 2
    iput p1, p0, Lf9/b$f;->a:I

    .line 3
    iput p1, p0, Lf9/b$f;->b:I

    const/4 p1, 0x0

    .line 4
    iput p1, p0, Lf9/b$f;->c:I

    .line 5
    iput p1, p0, Lf9/b$f;->d:I

    .line 6
    iput p1, p0, Lf9/b$f;->e:I

    .line 7
    iput p1, p0, Lf9/b$f;->f:I

    return-void
.end method

.method synthetic constructor <init>(Lf9/b;Lf9/b$a;)V
    .locals 0

    .line 8
    invoke-direct {p0, p1}, Lf9/b$f;-><init>(Lf9/b;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 7

    const/4 v0, -0x1

    .line 1
    iput v0, p0, Lf9/b$f;->b:I

    .line 2
    iget v0, p0, Lf9/b$f;->c:I

    int-to-float v2, v0

    iget v0, p0, Lf9/b$f;->d:I

    int-to-float v3, v0

    iget v0, p0, Lf9/b$f;->e:I

    int-to-float v4, v0

    iget v0, p0, Lf9/b$f;->f:I

    int-to-float v5, v0

    const/4 v1, 0x2

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGesture(IFFFFF)V

    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    if-nez p2, :cond_0

    goto/16 :goto_0

    .line 1
    :cond_0
    :try_start_0
    iget-object v1, p0, Lf9/b$f;->g:Lf9/b;

    invoke-static {v1}, Lf9/b;->e(Lf9/b;)F

    move-result v1

    .line 2
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    div-float/2addr v2, v1

    float-to-int v2, v2

    .line 3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    div-float/2addr p2, v1

    float-to-int p2, p2

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    div-float/2addr v3, v1

    float-to-int v3, v3

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    div-float/2addr p1, v1

    float-to-int p1, p1

    sub-int/2addr p2, p1

    int-to-float p2, p2

    sub-int/2addr v2, v3

    int-to-float v1, v2

    .line 6
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/4 v5, 0x0

    const/high16 v6, 0x42480000    # 50.0f

    cmpl-float v2, v2, v4

    if-lez v2, :cond_2

    .line 7
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p2, v6

    if-lez p2, :cond_4

    .line 8
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result p2

    cmpl-float p2, p2, v6

    if-lez p2, :cond_4

    cmpl-float p2, v1, v5

    if-lez p2, :cond_1

    .line 9
    iget-object p2, p0, Lf9/b$f;->g:Lf9/b;

    invoke-virtual {p2, v3, p1}, Lf9/b;->o(II)V

    goto :goto_0

    .line 10
    :cond_1
    iget-object p2, p0, Lf9/b$f;->g:Lf9/b;

    invoke-virtual {p2, v3, p1}, Lf9/b;->n(II)V

    goto :goto_0

    .line 11
    :cond_2
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p3, p3, v6

    if-lez p3, :cond_4

    .line 12
    invoke-static {p4}, Ljava/lang/Math;->abs(F)F

    move-result p3

    cmpl-float p3, p3, v6

    if-lez p3, :cond_4

    cmpl-float p2, p2, v5

    if-lez p2, :cond_3

    .line 13
    iget-object p2, p0, Lf9/b$f;->g:Lf9/b;

    invoke-virtual {p2, v3, p1}, Lf9/b;->m(II)V

    goto :goto_0

    .line 14
    :cond_3
    iget-object p2, p0, Lf9/b$f;->g:Lf9/b;

    invoke-virtual {p2, v3, p1}, Lf9/b;->p(II)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/Exception;->printStackTrace()V

    :cond_4
    :goto_0
    return v0
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v0

    .line 2
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    iput v0, p0, Lf9/b$f;->a:I

    .line 3
    iget-object v0, p0, Lf9/b$f;->g:Lf9/b;

    invoke-static {v0}, Lf9/b;->e(Lf9/b;)F

    move-result v0

    .line 4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    div-float/2addr v1, v0

    .line 5
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    div-float/2addr p1, v0

    const/4 v0, 0x0

    .line 6
    invoke-static {v0, v1, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassLongPressGesture(IFF)V

    return-void
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    if-nez v1, :cond_0

    goto :goto_1

    .line 1
    :cond_0
    iget v3, v0, Lf9/b$f;->b:I

    const/4 v4, -0x1

    if-ne v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    .line 2
    :goto_0
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getActionIndex()I

    move-result v4

    .line 3
    invoke-virtual {v1, v4}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v4

    iput v4, v0, Lf9/b$f;->b:I

    .line 4
    iget-object v4, v0, Lf9/b$f;->g:Lf9/b;

    invoke-static {v4}, Lf9/b;->e(Lf9/b;)F

    move-result v4

    .line 5
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    div-float/2addr v5, v4

    float-to-int v5, v5

    iput v5, v0, Lf9/b$f;->c:I

    .line 6
    invoke-virtual/range {p2 .. p2}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    div-float/2addr v1, v4

    float-to-int v1, v1

    iput v1, v0, Lf9/b$f;->d:I

    .line 7
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    div-float/2addr v1, v4

    float-to-int v1, v1

    .line 8
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    div-float/2addr v5, v4

    float-to-int v4, v5

    .line 9
    iget v5, v0, Lf9/b$f;->c:I

    sub-int v1, v5, v1

    iput v1, v0, Lf9/b$f;->e:I

    .line 10
    iget v6, v0, Lf9/b$f;->d:I

    sub-int v4, v6, v4

    iput v4, v0, Lf9/b$f;->f:I

    if-eqz v3, :cond_2

    const/4 v7, 0x0

    int-to-float v8, v5

    int-to-float v9, v6

    int-to-float v10, v1

    int-to-float v11, v4

    const/4 v12, 0x0

    .line 11
    invoke-static/range {v7 .. v12}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGesture(IFFFFF)V

    goto :goto_1

    :cond_2
    const/4 v13, 0x1

    int-to-float v14, v5

    int-to-float v15, v6

    int-to-float v1, v1

    int-to-float v3, v4

    const/16 v18, 0x0

    move/from16 v16, v1

    move/from16 v17, v3

    .line 12
    invoke-static/range {v13 .. v18}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassPanGesture(IFFFFF)V

    :cond_3
    :goto_1
    return v2
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lf9/b$f;->g:Lf9/b;

    invoke-static {v0}, Lf9/b;->e(Lf9/b;)F

    move-result v0

    .line 2
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    div-float/2addr v1, v0

    float-to-int v1, v1

    .line 3
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    div-float/2addr p1, v0

    float-to-int p1, p1

    int-to-float v0, v1

    int-to-float p1, p1

    .line 4
    invoke-static {v0, p1}, Lcom/roblox/engine/jni/NativeInputInterface;->nativePassTapGesture(FF)V

    const/4 p1, 0x0

    return p1
.end method
