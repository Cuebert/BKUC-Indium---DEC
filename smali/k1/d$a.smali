.class Lk1/d$a;
.super Lk1/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1/d;->t0(Landroid/view/View;FF)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lk1/d;


# direct methods
.method constructor <init>(Lk1/d;Landroid/view/View;)V
    .locals 0

    iput-object p1, p0, Lk1/d$a;->b:Lk1/d;

    iput-object p2, p0, Lk1/d$a;->a:Landroid/view/View;

    invoke-direct {p0}, Lk1/m;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lk1/l;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk1/d$a;->a:Landroid/view/View;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Lk1/y;->g(Landroid/view/View;F)V

    .line 2
    iget-object v0, p0, Lk1/d$a;->a:Landroid/view/View;

    invoke-static {v0}, Lk1/y;->a(Landroid/view/View;)V

    .line 3
    invoke-virtual {p1, p0}, Lk1/l;->Z(Lk1/l$f;)Lk1/l;

    return-void
.end method
