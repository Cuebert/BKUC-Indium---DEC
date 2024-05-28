.class public Lg9/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static h:Z


# instance fields
.field public a:Landroid/graphics/Rect;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Landroid/graphics/Rect;IIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lg9/b;->a:Landroid/graphics/Rect;

    .line 3
    iput p2, p0, Lg9/b;->b:I

    .line 4
    iput p3, p0, Lg9/b;->c:I

    .line 5
    iput p4, p0, Lg9/b;->d:I

    .line 6
    iput p5, p0, Lg9/b;->e:I

    .line 7
    iput p6, p0, Lg9/b;->f:I

    .line 8
    iput p7, p0, Lg9/b;->g:I

    return-void
.end method

.method public static a(Landroid/view/View;Landroid/view/WindowManager;Landroid/view/View;Landroid/graphics/Rect;)Lg9/b;
    .locals 9

    const-string v0, "getInfo() ------ start ------"

    .line 1
    invoke-static {v0}, Lg9/b;->b(Ljava/lang/String;)V

    .line 2
    new-instance v2, Landroid/graphics/Rect;

    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    .line 3
    invoke-virtual {p0, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getInfo() sr:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Landroid/graphics/Rect;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lg9/b;->b(Ljava/lang/String;)V

    .line 5
    new-instance v0, Landroid/graphics/Point;

    invoke-direct {v0}, Landroid/graphics/Point;-><init>()V

    .line 6
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getSize(Landroid/graphics/Point;)V

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "getInfo() ss:"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/graphics/Point;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lg9/b;->b(Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result v1

    .line 9
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    move-result p0

    .line 10
    invoke-static {}, Lf9/a;->b()Z

    move-result v3

    const/4 v4, 0x0

    if-nez v3, :cond_0

    .line 11
    new-instance v3, Landroid/graphics/Point;

    invoke-direct {v3}, Landroid/graphics/Point;-><init>()V

    .line 12
    invoke-interface {p1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object p1

    invoke-virtual {p1, v3}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 13
    iget p1, v3, Landroid/graphics/Point;->y:I

    .line 14
    iget v3, v3, Landroid/graphics/Point;->x:I

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    const/4 v3, 0x0

    .line 15
    :goto_0
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getInfo() sh1:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " sh2:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lg9/b;->b(Ljava/lang/String;)V

    if-le v1, p1, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    move p0, v3

    move v3, p1

    .line 16
    :goto_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "getInfo() sh:"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lg9/b;->b(Ljava/lang/String;)V

    if-eqz p3, :cond_2

    .line 17
    iget p1, p3, Landroid/graphics/Rect;->bottom:I

    goto :goto_2

    .line 18
    :cond_2
    iget p1, v2, Landroid/graphics/Rect;->bottom:I

    sub-int p1, v3, p1

    .line 19
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getInfo() bm:"

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lg9/b;->b(Ljava/lang/String;)V

    .line 20
    iget v1, v0, Landroid/graphics/Point;->y:I

    sub-int v1, v3, v1

    .line 21
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "getInfo() sbh:"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lg9/b;->b(Ljava/lang/String;)V

    if-eqz p3, :cond_3

    .line 22
    iget p2, p3, Landroid/graphics/Rect;->top:I

    :goto_3
    move v8, p2

    goto :goto_4

    :cond_3
    const/4 v5, 0x2

    new-array v5, v5, [I

    if-eqz p2, :cond_4

    .line 23
    invoke-virtual {p2, v5}, Landroid/view/View;->getLocationInWindow([I)V

    :cond_4
    const/4 p2, 0x1

    aget p2, v5, p2

    goto :goto_3

    .line 24
    :goto_4
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getInfo() top:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lg9/b;->b(Ljava/lang/String;)V

    .line 25
    iget p2, v2, Landroid/graphics/Rect;->bottom:I

    .line 26
    invoke-static {}, Lf9/a;->c()Z

    move-result v5

    if-eqz v5, :cond_5

    .line 27
    iget v5, v2, Landroid/graphics/Rect;->top:I

    if-ge v8, v5, :cond_5

    const-string v5, "getInfo() adjusting top margin"

    .line 28
    invoke-static {v5}, Lg9/b;->b(Ljava/lang/String;)V

    .line 29
    iget v5, v2, Landroid/graphics/Rect;->top:I

    sub-int/2addr p2, v5

    sub-int/2addr v1, v5

    :cond_5
    move v7, p2

    .line 30
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "getInfo() kby:"

    invoke-virtual {p2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lg9/b;->b(Ljava/lang/String;)V

    if-eqz p3, :cond_6

    .line 31
    iget p0, p3, Landroid/graphics/Rect;->right:I

    goto :goto_5

    .line 32
    :cond_6
    iget p2, v0, Landroid/graphics/Point;->x:I

    sub-int/2addr p0, p2

    :goto_5
    move v5, p0

    .line 33
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "getInfo() rsbw:"

    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lg9/b;->b(Ljava/lang/String;)V

    .line 34
    invoke-static {}, Lf9/a;->b()Z

    move-result p0

    if-eqz p0, :cond_7

    const/4 p0, 0x0

    goto :goto_6

    .line 35
    :cond_7
    invoke-static {p1, v1}, Ljava/lang/Math;->min(II)I

    move-result p0

    .line 36
    :goto_6
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "getInfo() rsbh:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lg9/b;->b(Ljava/lang/String;)V

    sub-int/2addr p1, v1

    .line 37
    invoke-static {v4, p1}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 38
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "getInfo() kbh:"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lg9/b;->b(Ljava/lang/String;)V

    .line 39
    new-instance p1, Lg9/b;

    move-object v1, p1

    move v4, p0

    invoke-direct/range {v1 .. v8}, Lg9/b;-><init>(Landroid/graphics/Rect;IIIIII)V

    return-object p1
.end method

.method private static b(Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-boolean v0, Lg9/b;->h:Z

    if-eqz v0, :cond_0

    const-string v0, "rbx.screen"

    .line 2
    invoke-static {v0, p0}, Lc9/k;->h(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1
    :cond_0
    instance-of v1, p1, Lg9/b;

    if-eqz v1, :cond_1

    .line 2
    check-cast p1, Lg9/b;

    .line 3
    iget-object v1, p1, Lg9/b;->a:Landroid/graphics/Rect;

    iget-object v2, p0, Lg9/b;->a:Landroid/graphics/Rect;

    invoke-virtual {v1, v2}, Landroid/graphics/Rect;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p1, Lg9/b;->b:I

    iget v2, p0, Lg9/b;->b:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lg9/b;->c:I

    iget v2, p0, Lg9/b;->c:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lg9/b;->d:I

    iget v2, p0, Lg9/b;->d:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lg9/b;->e:I

    iget v2, p0, Lg9/b;->e:I

    if-ne v1, v2, :cond_1

    iget v1, p1, Lg9/b;->f:I

    iget v2, p0, Lg9/b;->f:I

    if-ne v1, v2, :cond_1

    iget p1, p1, Lg9/b;->g:I

    iget v1, p0, Lg9/b;->g:I

    if-ne p1, v1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method
