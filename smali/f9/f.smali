.class public Lf9/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field private final a:Landroid/app/Activity;

.field private final b:Landroid/view/View;

.field private c:I


# direct methods
.method public constructor <init>(Landroid/app/Activity;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lf9/f;->a:Landroid/app/Activity;

    .line 3
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v0, p1

    check-cast v0, Landroid/view/Window;

    .line 4
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object p1

    iput-object p1, p0, Lf9/f;->b:Landroid/view/View;

    .line 5
    invoke-direct {p0}, Lf9/f;->a()I

    move-result p1

    iput p1, p0, Lf9/f;->c:I

    return-void
.end method

.method private a()I
    .locals 1

    .line 1
    iget-object v0, p0, Lf9/f;->a:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/Display;->getRotation()I

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method protected b(I)V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public c()V
    .locals 2

    const-string v0, "ViewOrientationListener"

    const-string v1, "startListening"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    invoke-direct {p0}, Lf9/f;->a()I

    move-result v0

    iput v0, p0, Lf9/f;->c:I

    .line 3
    iget-object v0, p0, Lf9/f;->b:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 4
    iget v0, p0, Lf9/f;->c:I

    invoke-virtual {p0, v0}, Lf9/f;->b(I)V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "ViewOrientationListener"

    const-string v1, "stopListening"

    .line 1
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 2
    iget-object v0, p0, Lf9/f;->b:Landroid/view/View;

    invoke-virtual {v0, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    return-void
.end method

.method public onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lf9/f;->a()I

    move-result p1

    .line 2
    iget p2, p0, Lf9/f;->c:I

    if-eq p2, p1, :cond_0

    .line 3
    iput p1, p0, Lf9/f;->c:I

    .line 4
    invoke-virtual {p0, p1}, Lf9/f;->b(I)V

    :cond_0
    return-void
.end method
