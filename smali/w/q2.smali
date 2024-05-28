.class public final Lw/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lw/o2;
.implements Lw/f1;
.implements Lz/k;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lw/o2<",
        "Landroidx/camera/core/d3;",
        ">;",
        "Lw/f1;",
        "Lz/k;"
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
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public static final D:Lw/o0$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lw/o0$a<",
            "Ljava/lang/Integer;",
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
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final z:Lw/u1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    const-string v1, "camerax.core.videoCapture.recordingFrameRate"

    .line 2
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/q2;->A:Lw/o0$a;

    const-string v1, "camerax.core.videoCapture.bitRate"

    .line 3
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/q2;->B:Lw/o0$a;

    const-string v1, "camerax.core.videoCapture.intraFrameInterval"

    .line 4
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/q2;->C:Lw/o0$a;

    const-string v1, "camerax.core.videoCapture.audioBitRate"

    .line 5
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/q2;->D:Lw/o0$a;

    const-string v1, "camerax.core.videoCapture.audioSampleRate"

    .line 6
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/q2;->E:Lw/o0$a;

    const-string v1, "camerax.core.videoCapture.audioChannelCount"

    .line 7
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v1

    sput-object v1, Lw/q2;->F:Lw/o0$a;

    const-string v1, "camerax.core.videoCapture.audioMinBufferSize"

    .line 8
    invoke-static {v1, v0}, Lw/o0$a;->a(Ljava/lang/String;Ljava/lang/Class;)Lw/o0$a;

    move-result-object v0

    sput-object v0, Lw/q2;->G:Lw/o0$a;

    return-void
.end method

.method public constructor <init>(Lw/u1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw/q2;->z:Lw/u1;

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

.method public H()I
    .locals 1

    sget-object v0, Lw/q2;->D:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/q2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public I()I
    .locals 1

    sget-object v0, Lw/q2;->F:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/q2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public J()I
    .locals 1

    sget-object v0, Lw/q2;->G:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/q2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public K()I
    .locals 1

    sget-object v0, Lw/q2;->E:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/q2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public L()I
    .locals 1

    sget-object v0, Lw/q2;->B:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/q2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public M()I
    .locals 1

    sget-object v0, Lw/q2;->C:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/q2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method public N()I
    .locals 1

    sget-object v0, Lw/q2;->A:Lw/o0$a;

    invoke-virtual {p0, v0}, Lw/q2;->b(Lw/o0$a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

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

    iget-object v0, p0, Lw/q2;->z:Lw/u1;

    return-object v0
.end method

.method public q()I
    .locals 1

    const/16 v0, 0x22

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
