.class public final Lw/a1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o2;
.implements Lw/f1;
.implements Lz/g;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/o2<",
        "Landroidx/camera/core/e1;",
        ">;",
        "Lw/f1;",
        "Lz/g;"
    }
.end annotation


# static fields
.field public static final A:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final B:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final C:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/j0;",
            ">;"
        }
    .end annotation
.end field

.field public static final D:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Lw/l0;",
            ">;"
        }
    .end annotation
.end field

.field public static final E:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final F:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final G:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Landroidx/camera/core/m1;",
            ">;"
        }
    .end annotation
.end field

.field public static final H:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public static final I:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final J:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final K:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final z:Lw/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-class v0, Ljava/lang/Integer;

    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v2, "camerax.core.imageCapture.captureMode"

    .line 2
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v2

    sput-object v2, Lw/a1;->A:Lw/o0$a;

    const-string v2, "camerax.core.imageCapture.flashMode"

    .line 3
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v2

    sput-object v2, Lw/a1;->B:Lw/o0$a;

    .line 4
    const-class v2, Lw/j0;

    const-string v3, "camerax.core.imageCapture.captureBundle"

    .line 5
    invoke-static {v3, v2}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v2

    sput-object v2, Lw/a1;->C:Lw/o0$a;

    .line 6
    const-class v2, Lw/l0;

    const-string v3, "camerax.core.imageCapture.captureProcessor"

    .line 7
    invoke-static {v3, v2}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v2

    sput-object v2, Lw/a1;->D:Lw/o0$a;

    const-string v2, "camerax.core.imageCapture.bufferFormat"

    .line 8
    invoke-static {v2, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v2

    sput-object v2, Lw/a1;->E:Lw/o0$a;

    const-string v2, "camerax.core.imageCapture.maxCaptureStages"

    .line 9
    invoke-static {v2, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/a1;->F:Lw/o0$a;

    .line 10
    const-class v0, Landroidx/camera/core/m1;

    const-string v2, "camerax.core.imageCapture.imageReaderProxyProvider"

    .line 11
    invoke-static {v2, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/a1;->G:Lw/o0$a;

    .line 12
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    const-string v2, "camerax.core.imageCapture.useSoftwareJpegEncoder"

    .line 13
    invoke-static {v2, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v2

    sput-object v2, Lw/a1;->H:Lw/o0$a;

    const-string v2, "camerax.core.imageCapture.flashType"

    .line 14
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v2

    sput-object v2, Lw/a1;->I:Lw/o0$a;

    const-string v2, "camerax.core.imageCapture.jpegCompressionQuality"

    .line 15
    invoke-static {v2, v1}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/a1;->J:Lw/o0$a;

    const-string v1, "camerax.core.imageCapture.sessionProcessorEnabled"

    .line 16
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/a1;->K:Lw/o0$a;

    return-void
.end method

.method public constructor <init>(Lw/u1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/a1;->z:Lw/u1;

    return-void
.end method


# virtual methods
.method public synthetic A(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/e1;->a(Lw/f1;I)I

    move-result p1

    return p1
.end method

.method public synthetic B(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p0, p1}, Lz/h;->a(Lz/i;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public synthetic D(Landroidx/camera/core/y2$b;)Landroidx/camera/core/y2$b;
    .locals 0

    invoke-static {p0, p1}, Lz/l;->a(Lz/m;Landroidx/camera/core/y2$b;)Landroidx/camera/core/y2$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic E(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/e1;->g(Lw/f1;I)I

    move-result p1

    return p1
.end method

.method public H(Lw/j0;)Lw/j0;
    .locals 1

    sget-object v0, Lw/a1;->C:Lw/o0$a;

    invoke-virtual {p0, v0, p1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/j0;

    return-object p1
.end method

.method public I()I
    .locals 1

    sget-object v0, Lw/a1;->A:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/a1;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public J(Lw/l0;)Lw/l0;
    .locals 1

    sget-object v0, Lw/a1;->D:Lw/o0$a;

    invoke-virtual {p0, v0, p1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lw/l0;

    return-object p1
.end method

.method public K(I)I
    .locals 1

    sget-object v0, Lw/a1;->B:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public L(I)I
    .locals 1

    sget-object v0, Lw/a1;->I:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public M()Landroidx/camera/core/m1;
    .locals 2

    sget-object v0, Lw/a1;->G:Lw/o0$a;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroidx/camera/core/m1;

    return-object v0
.end method

.method public N(Ljava/util/concurrent/Executor;)Ljava/util/concurrent/Executor;
    .locals 1

    sget-object v0, Lz/g;->u:Lw/o0$a;

    invoke-virtual {p0, v0, p1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/Executor;

    return-object p1
.end method

.method public O()I
    .locals 1

    sget-object v0, Lw/a1;->J:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/a1;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public P(I)I
    .locals 1

    sget-object v0, Lw/a1;->F:Lw/o0$a;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    return p1
.end method

.method public Q()Z
    .locals 1

    sget-object v0, Lw/a1;->A:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/a1;->e(Lw/o0$a;)Z

    move-result v0

    return v0
.end method

.method public R()Z
    .locals 2

    sget-object v0, Lw/a1;->K:Lw/o0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public S()Z
    .locals 2

    sget-object v0, Lw/a1;->H:Lw/o0$a;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p0, v0, v1}, Lw/a1;->a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public synthetic a(Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->g(Lw/a2;Lw/o0$a;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic b(Lw/o0$a;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->f(Lw/a2;Lw/o0$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic c()Ljava/util/Set;
    .locals 1

    invoke-static {p0}, Lw/z1;->e(Lw/a2;)Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public synthetic d(Lw/o0$a;)Lw/o0$c;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->c(Lw/a2;Lw/o0$a;)Lw/o0$c;

    move-result-object p1

    return-object p1
.end method

.method public synthetic e(Lw/o0$a;)Z
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->a(Lw/a2;Lw/o0$a;)Z

    move-result p1

    return p1
.end method

.method public synthetic f(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/e1;->c(Lw/f1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic i(Lw/k0;)Lw/k0;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->c(Lw/o2;Lw/k0;)Lw/k0;

    move-result-object p1

    return-object p1
.end method

.method public synthetic j(Lw/k0$b;)Lw/k0$b;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->b(Lw/o2;Lw/k0$b;)Lw/k0$b;

    move-result-object p1

    return-object p1
.end method

.method public synthetic k(Ljava/util/List;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1}, Lw/e1;->d(Lw/f1;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public synthetic l()Z
    .locals 1

    invoke-static {p0}, Lw/e1;->h(Lw/f1;)Z

    move-result v0

    return v0
.end method

.method public synthetic m(I)I
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->f(Lw/o2;I)I

    move-result p1

    return p1
.end method

.method public synthetic n()I
    .locals 1

    invoke-static {p0}, Lw/e1;->e(Lw/f1;)I

    move-result v0

    return v0
.end method

.method public o()Lw/o0;
    .locals 1

    iget-object v0, p0, Lw/a1;->z:Lw/u1;

    return-object v0
.end method

.method public q()I
    .locals 1

    sget-object v0, Lw/d1;->f:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/a1;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public synthetic r(Lw/c2$d;)Lw/c2$d;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->e(Lw/o2;Lw/c2$d;)Lw/c2$d;

    move-result-object p1

    return-object p1
.end method

.method public synthetic t(Lw/o0$a;Lw/o0$c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->h(Lw/a2;Lw/o0$a;Lw/o0$c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public synthetic u(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/e1;->b(Lw/f1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method public synthetic v(Ljava/lang/String;Lw/o0$b;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lw/z1;->b(Lw/a2;Ljava/lang/String;Lw/o0$b;)V

    return-void
.end method

.method public synthetic w(Lw/c2;)Lw/c2;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->d(Lw/o2;Lw/c2;)Lw/c2;

    move-result-object p1

    return-object p1
.end method

.method public synthetic x(Lw/o0$a;)Ljava/util/Set;
    .locals 0

    invoke-static {p0, p1}, Lw/z1;->d(Lw/a2;Lw/o0$a;)Ljava/util/Set;

    move-result-object p1

    return-object p1
.end method

.method public synthetic y(Landroidx/camera/core/s;)Landroidx/camera/core/s;
    .locals 0

    invoke-static {p0, p1}, Lw/n2;->a(Lw/o2;Landroidx/camera/core/s;)Landroidx/camera/core/s;

    move-result-object p1

    return-object p1
.end method

.method public synthetic z(Landroid/util/Size;)Landroid/util/Size;
    .locals 0

    invoke-static {p0, p1}, Lw/e1;->f(Lw/f1;Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method
