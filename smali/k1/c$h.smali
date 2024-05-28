.class Lk1/c$h;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk1/c;->r(Landroid/view/ViewGroup;Lk1/r;Lk1/r;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lk1/c$k;

.field final synthetic b:Lk1/c;

.field private mViewBounds:Lk1/c$k;


# direct methods
.method constructor <init>(Lk1/c;Lk1/c$k;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk1/c$h;->b:Lk1/c;

    iput-object p2, p0, Lk1/c$h;->a:Lk1/c$k;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    .line 2
    iput-object p2, p0, Lk1/c$h;->mViewBounds:Lk1/c$k;

    return-void
.end method
