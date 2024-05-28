.class Lm0/o$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm0/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field a:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Ll0/e;",
            ">;"
        }
    .end annotation
.end field

.field b:I

.field c:I

.field d:I

.field e:I

.field f:I

.field g:I

.field final synthetic h:Lm0/o;


# direct methods
.method public constructor <init>(Lm0/o;Ll0/e;Lk0/d;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm0/o$a;->h:Lm0/o;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance p1, Ljava/lang/ref/WeakReference;

    invoke-direct {p1, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lm0/o$a;->a:Ljava/lang/ref/WeakReference;

    .line 3
    iget-object p1, p2, Ll0/e;->H:Ll0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lm0/o$a;->b:I

    .line 4
    iget-object p1, p2, Ll0/e;->I:Ll0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lm0/o$a;->c:I

    .line 5
    iget-object p1, p2, Ll0/e;->J:Ll0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lm0/o$a;->d:I

    .line 6
    iget-object p1, p2, Ll0/e;->K:Ll0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lm0/o$a;->e:I

    .line 7
    iget-object p1, p2, Ll0/e;->L:Ll0/d;

    invoke-virtual {p3, p1}, Lk0/d;->x(Ljava/lang/Object;)I

    move-result p1

    iput p1, p0, Lm0/o$a;->f:I

    .line 8
    iput p4, p0, Lm0/o$a;->g:I

    return-void
.end method
