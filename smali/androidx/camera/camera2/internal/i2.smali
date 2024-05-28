.class final Landroidx/camera/camera2/internal/i2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/camera2/internal/i2$a;
    }
.end annotation


# static fields
.field private static final q:Landroid/util/Size;

.field private static final r:Landroid/util/Size;

.field private static final s:Landroid/util/Size;

.field private static final t:Landroid/util/Size;

.field private static final u:Landroid/util/Rational;

.field private static final v:Landroid/util/Rational;

.field private static final w:Landroid/util/Rational;

.field private static final x:Landroid/util/Rational;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/lang/String;

.field private final d:Landroidx/camera/camera2/internal/c;

.field private final e:Lr/z;

.field private final f:Lu/d;

.field private final g:Lu/e;

.field private final h:I

.field private final i:Z

.field private final j:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation
.end field

.field private k:Z

.field private l:Z

.field private m:Lw/i2;

.field private n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "[",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Landroidx/camera/camera2/internal/v1;

.field private final p:Lu/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->q:Landroid/util/Size;

    .line 2
    new-instance v0, Landroid/util/Size;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->r:Landroid/util/Size;

    .line 3
    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x780

    const/16 v3, 0x438

    invoke-direct {v0, v1, v3}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->s:Landroid/util/Size;

    .line 4
    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x2d0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->t:Landroid/util/Size;

    .line 5
    new-instance v0, Landroid/util/Rational;

    const/4 v1, 0x4

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Landroid/util/Rational;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->u:Landroid/util/Rational;

    .line 6
    new-instance v0, Landroid/util/Rational;

    invoke-direct {v0, v2, v1}, Landroid/util/Rational;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->v:Landroid/util/Rational;

    .line 7
    new-instance v0, Landroid/util/Rational;

    const/16 v1, 0x10

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Landroid/util/Rational;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->w:Landroid/util/Rational;

    .line 8
    new-instance v0, Landroid/util/Rational;

    invoke-direct {v0, v2, v1}, Landroid/util/Rational;-><init>(II)V

    sput-object v0, Landroidx/camera/camera2/internal/i2;->x:Landroid/util/Rational;

    return-void
.end method

.method constructor <init>(Landroid/content/Context;Ljava/lang/String;Lr/m0;Landroidx/camera/camera2/internal/c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroidx/camera/core/u;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    .line 3
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->b:Ljava/util/Map;

    .line 4
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->j:Ljava/util/Map;

    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/i2;->k:Z

    .line 6
    iput-boolean v0, p0, Landroidx/camera/camera2/internal/i2;->l:Z

    .line 7
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->n:Ljava/util/Map;

    .line 8
    new-instance v0, Lu/n;

    invoke-direct {v0}, Lu/n;-><init>()V

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->p:Lu/n;

    .line 9
    invoke-static {p2}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->c:Ljava/lang/String;

    .line 10
    invoke-static {p4}, Landroidx/core/util/h;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/camera/camera2/internal/c;

    iput-object p4, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    .line 11
    new-instance p4, Lu/d;

    invoke-direct {p4, p2}, Lu/d;-><init>(Ljava/lang/String;)V

    iput-object p4, p0, Landroidx/camera/camera2/internal/i2;->f:Lu/d;

    .line 12
    new-instance p2, Lu/e;

    invoke-direct {p2}, Lu/e;-><init>()V

    iput-object p2, p0, Landroidx/camera/camera2/internal/i2;->g:Lu/e;

    .line 13
    invoke-static {p1}, Landroidx/camera/camera2/internal/v1;->b(Landroid/content/Context;)Landroidx/camera/camera2/internal/v1;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/i2;->o:Landroidx/camera/camera2/internal/v1;

    .line 14
    :try_start_0
    invoke-virtual {p3, v0}, Lr/m0;->c(Ljava/lang/String;)Lr/z;

    move-result-object p1

    iput-object p1, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    .line 15
    sget-object p2, Landroid/hardware/camera2/CameraCharacteristics;->INFO_SUPPORTED_HARDWARE_LEVEL:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {p1, p2}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-eqz p1, :cond_0

    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x2

    .line 17
    :goto_0
    iput p1, p0, Landroidx/camera/camera2/internal/i2;->h:I

    .line 18
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->H()Z

    move-result p1

    iput-boolean p1, p0, Landroidx/camera/camera2/internal/i2;->i:Z
    :try_end_0
    .catch Lr/f; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->h()V

    .line 20
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->i()V

    .line 21
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->a()V

    return-void

    :catch_0
    move-exception p1

    .line 22
    invoke-static {p1}, Landroidx/camera/camera2/internal/j1;->a(Lr/f;)Landroidx/camera/core/u;

    move-result-object p1

    throw p1
.end method

.method private A(Lw/f1;)Landroid/util/Rational;
    .locals 4

    .line 1
    new-instance v0, Lu/q;

    invoke-direct {v0}, Lu/q;-><init>()V

    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->c:Ljava/lang/String;

    iget-object v2, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    .line 2
    invoke-virtual {v0, v1, v2}, Lu/q;->a(Ljava/lang/String;Lr/z;)I

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    const/4 v2, 0x1

    if-eq v0, v2, :cond_7

    const/4 v3, 0x2

    if-eq v0, v3, :cond_6

    const/4 v3, 0x3

    if-eq v0, v3, :cond_0

    goto/16 :goto_1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i2;->B(Lw/f1;)Landroid/util/Size;

    move-result-object v0

    .line 4
    invoke-interface {p1}, Lw/f1;->l()Z

    move-result v3

    if-eqz v3, :cond_5

    .line 5
    invoke-interface {p1}, Lw/f1;->n()I

    move-result p1

    if-eqz p1, :cond_3

    if-eq p1, v2, :cond_1

    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Undefined target aspect ratio: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "SupportedSurfaceCombination"

    invoke-static {v0, p1}, Landroidx/camera/core/q1;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    .line 7
    :cond_1
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/i2;->i:Z

    if-eqz p1, :cond_2

    sget-object p1, Landroidx/camera/camera2/internal/i2;->w:Landroid/util/Rational;

    goto :goto_0

    .line 8
    :cond_2
    sget-object p1, Landroidx/camera/camera2/internal/i2;->x:Landroid/util/Rational;

    goto :goto_0

    .line 9
    :cond_3
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/i2;->i:Z

    if-eqz p1, :cond_4

    sget-object p1, Landroidx/camera/camera2/internal/i2;->u:Landroid/util/Rational;

    goto :goto_0

    .line 10
    :cond_4
    sget-object p1, Landroidx/camera/camera2/internal/i2;->v:Landroid/util/Rational;

    :goto_0
    move-object v1, p1

    goto :goto_1

    :cond_5
    if-eqz v0, :cond_b

    .line 11
    new-instance v1, Landroid/util/Rational;

    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-direct {v1, p1, v0}, Landroid/util/Rational;-><init>(II)V

    goto :goto_1

    :cond_6
    const/16 p1, 0x100

    .line 12
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i2;->f(I)Landroid/util/Size;

    move-result-object p1

    .line 13
    new-instance v1, Landroid/util/Rational;

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    invoke-direct {v1, v0, p1}, Landroid/util/Rational;-><init>(II)V

    goto :goto_1

    .line 14
    :cond_7
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/i2;->i:Z

    if-eqz p1, :cond_8

    sget-object p1, Landroidx/camera/camera2/internal/i2;->w:Landroid/util/Rational;

    goto :goto_0

    :cond_8
    sget-object p1, Landroidx/camera/camera2/internal/i2;->x:Landroid/util/Rational;

    goto :goto_0

    .line 15
    :cond_9
    iget-boolean p1, p0, Landroidx/camera/camera2/internal/i2;->i:Z

    if-eqz p1, :cond_a

    sget-object p1, Landroidx/camera/camera2/internal/i2;->u:Landroid/util/Rational;

    goto :goto_0

    :cond_a
    sget-object p1, Landroidx/camera/camera2/internal/i2;->v:Landroid/util/Rational;

    goto :goto_0

    :cond_b
    :goto_1
    return-object v1
.end method

.method private B(Lw/f1;)Landroid/util/Size;
    .locals 2

    const/4 v0, 0x0

    .line 1
    invoke-interface {p1, v0}, Lw/f1;->E(I)I

    move-result v0

    const/4 v1, 0x0

    .line 2
    invoke-interface {p1, v1}, Lw/f1;->z(Landroid/util/Size;)Landroid/util/Size;

    move-result-object p1

    .line 3
    invoke-direct {p0, p1, v0}, Landroidx/camera/camera2/internal/i2;->g(Landroid/util/Size;I)Landroid/util/Size;

    move-result-object p1

    return-object p1
.end method

.method private C(Ljava/util/List;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/o2<",
            "*>;>;)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lw/o2;

    .line 4
    invoke-interface {v3, v4}, Lw/o2;->m(I)I

    move-result v3

    .line 5
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    .line 6
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 7
    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 8
    invoke-static {v1}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    .line 9
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 10
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw/o2;

    .line 11
    invoke-interface {v5, v4}, Lw/o2;->m(I)I

    move-result v6

    if-ne v2, v6, :cond_3

    .line 12
    invoke-interface {p1, v5}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-object v0
.end method

.method private D(Ljava/util/List;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;)",
            "Ljava/util/Map<",
            "Landroid/util/Rational;",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 2
    sget-object v1, Landroidx/camera/camera2/internal/i2;->u:Landroid/util/Rational;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    sget-object v1, Landroidx/camera/camera2/internal/i2;->w:Landroid/util/Rational;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Size;

    const/4 v2, 0x0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Rational;

    .line 6
    invoke-static {v1, v4}, Landroidx/camera/camera2/internal/i2;->E(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 7
    invoke-interface {v0, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    .line 8
    invoke-interface {v2, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    .line 9
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_2
    move-object v2, v4

    goto :goto_1

    :cond_3
    if-nez v2, :cond_0

    .line 10
    new-instance v2, Landroid/util/Rational;

    .line 11
    invoke-virtual {v1}, Landroid/util/Size;->getWidth()I

    move-result v3

    invoke-virtual {v1}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-direct {v2, v3, v4}, Landroid/util/Rational;-><init>(II)V

    new-instance v3, Ljava/util/ArrayList;

    .line 12
    invoke-static {v1}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object v0
.end method

.method static E(Landroid/util/Size;Landroid/util/Rational;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    goto :goto_0

    .line 1
    :cond_0
    new-instance v1, Landroid/util/Rational;

    .line 2
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    .line 3
    invoke-virtual {p1, v1}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    .line 4
    :cond_1
    invoke-static {p0}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v1

    sget-object v2, Landroidx/camera/camera2/internal/i2;->q:Landroid/util/Size;

    invoke-static {v2}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v2

    if-lt v1, v2, :cond_2

    .line 5
    invoke-static {p0, p1}, Landroidx/camera/camera2/internal/i2;->F(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result v0

    :cond_2
    :goto_0
    return v0
.end method

.method private static F(Landroid/util/Size;Landroid/util/Rational;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    .line 2
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    .line 3
    new-instance v1, Landroid/util/Rational;

    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    move-result v2

    .line 4
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    .line 5
    rem-int/lit8 v2, v0, 0x10

    const/4 v3, 0x0

    if-nez v2, :cond_2

    rem-int/lit8 v4, p0, 0x10

    if-nez v4, :cond_2

    add-int/lit8 v2, p0, -0x10

    .line 6
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v2, v0, p1}, Landroidx/camera/camera2/internal/i2;->I(IILandroid/util/Rational;)Z

    move-result p1

    if-nez p1, :cond_0

    add-int/lit8 v0, v0, -0x10

    .line 7
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, p0, v1}, Landroidx/camera/camera2/internal/i2;->I(IILandroid/util/Rational;)Z

    move-result p0

    if-eqz p0, :cond_1

    :cond_0
    const/4 v3, 0x1

    :cond_1
    return v3

    :cond_2
    if-nez v2, :cond_3

    .line 8
    invoke-static {p0, v0, p1}, Landroidx/camera/camera2/internal/i2;->I(IILandroid/util/Rational;)Z

    move-result p0

    return p0

    .line 9
    :cond_3
    rem-int/lit8 p1, p0, 0x10

    if-nez p1, :cond_4

    .line 10
    invoke-static {v0, p0, v1}, Landroidx/camera/camera2/internal/i2;->I(IILandroid/util/Rational;)Z

    move-result p0

    return p0

    :cond_4
    return v3
.end method

.method private G(I)Z
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_ORIENTATION:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "Camera HAL in bad state, unable to retrieve the SENSOR_ORIENTATION"

    .line 2
    invoke-static {v0, v1}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 3
    invoke-static {p1}, Landroidx/camera/core/impl/utils/b;->b(I)I

    move-result p1

    .line 4
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    sget-object v2, Landroid/hardware/camera2/CameraCharacteristics;->LENS_FACING:Landroid/hardware/camera2/CameraCharacteristics$Key;

    invoke-virtual {v1, v2}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    const-string v2, "Camera HAL in bad state, unable to retrieve the LENS_FACING"

    .line 5
    invoke-static {v1, v2}, Landroidx/core/util/h;->g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-ne v3, v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    .line 8
    invoke-static {p1, v0, v1}, Landroidx/camera/core/impl/utils/b;->a(IIZ)I

    move-result p1

    const/16 v0, 0x5a

    if-eq p1, v0, :cond_1

    const/16 v0, 0x10e

    if-ne p1, v0, :cond_2

    :cond_1
    const/4 v2, 0x1

    :cond_2
    return v2
.end method

.method private H()Z
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SENSOR_INFO_PIXEL_ARRAY_SIZE:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    .line 3
    invoke-virtual {v0}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {v0}, Landroid/util/Size;->getHeight()I

    move-result v0

    if-lt v2, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method

.method private static I(IILandroid/util/Rational;)Z
    .locals 7

    .line 1
    rem-int/lit8 v0, p1, 0x10

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Landroidx/core/util/h;->a(Z)V

    .line 2
    invoke-virtual {p2}, Landroid/util/Rational;->getNumerator()I

    move-result v0

    mul-int p0, p0, v0

    int-to-double v3, p0

    invoke-virtual {p2}, Landroid/util/Rational;->getDenominator()I

    move-result p0

    int-to-double v5, p0

    div-double/2addr v3, v5

    add-int/lit8 p0, p1, -0x10

    .line 3
    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    int-to-double v5, p0

    cmpl-double p0, v3, v5

    if-lez p0, :cond_1

    add-int/lit8 p1, p1, 0x10

    int-to-double p0, p1

    cmpg-double p2, v3, p0

    if-gez p2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    return v1
.end method

.method private J()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->o:Landroidx/camera/camera2/internal/v1;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/v1;->e()V

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    if-nez v0, :cond_0

    .line 3
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->i()V

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->o:Landroidx/camera/camera2/internal/v1;

    invoke-virtual {v0}, Landroidx/camera/camera2/internal/v1;->d()Landroid/util/Size;

    move-result-object v0

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 6
    invoke-virtual {v1}, Lw/i2;->b()Landroid/util/Size;

    move-result-object v1

    iget-object v2, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 7
    invoke-virtual {v2}, Lw/i2;->d()Landroid/util/Size;

    move-result-object v2

    .line 8
    invoke-static {v1, v0, v2}, Lw/i2;->a(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)Lw/i2;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    :goto_0
    return-void
.end method

.method private K(Ljava/util/List;Landroid/util/Size;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;",
            "Landroid/util/Size;",
            ")V"
        }
    .end annotation

    if-eqz p1, :cond_3

    .line 1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const/4 v0, -0x1

    .line 2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v0, 0x0

    const/4 v2, -0x1

    .line 3
    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v0, v3, :cond_2

    .line 4
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Size;

    .line 5
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v5

    if-lt v4, v5, :cond_2

    .line 6
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result v4

    if-lt v3, v4, :cond_2

    if-ltz v2, :cond_1

    .line 7
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/util/Size;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    add-int/lit8 v2, v0, 0x1

    move v6, v2

    move v2, v0

    move v0, v6

    goto :goto_0

    .line 8
    :cond_2
    invoke-interface {p1, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method private a()V
    .locals 0

    return-void
.end method

.method private c(I)[Landroid/util/Size;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-eqz v0, :cond_2

    .line 3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x17

    if-ge v1, v2, :cond_0

    const/16 v1, 0x22

    if-ne p1, v1, :cond_0

    .line 4
    const-class v1, Landroid/graphics/SurfaceTexture;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v0

    goto :goto_0

    .line 5
    :cond_0
    invoke-virtual {v0, p1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(I)[Landroid/util/Size;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    .line 6
    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/i2;->d([Landroid/util/Size;I)[Landroid/util/Size;

    move-result-object p1

    .line 7
    new-instance v0, Landroidx/camera/core/impl/utils/c;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroidx/camera/core/impl/utils/c;-><init>(Z)V

    invoke-static {p1, v0}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    return-object p1

    .line 8
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can not get supported output size for the format: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 9
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private d([Landroid/util/Size;I)[Landroid/util/Size;
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Landroidx/camera/camera2/internal/i2;->e(I)Ljava/util/List;

    move-result-object p2

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3
    invoke-interface {v0, p2}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    const/4 p1, 0x0

    new-array p1, p1, [Landroid/util/Size;

    .line 4
    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Landroid/util/Size;

    return-object p1
.end method

.method private e(I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->j:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->f:Lu/d;

    invoke-virtual {v0, p1}, Lu/d;->a(I)Ljava/util/List;

    move-result-object v0

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->j:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private f(I)Landroid/util/Size;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/util/Size;

    if-eqz v0, :cond_0

    return-object v0

    .line 2
    :cond_0
    invoke-virtual {p0, p1}, Landroidx/camera/camera2/internal/i2;->t(I)Landroid/util/Size;

    move-result-object v0

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->b:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method private g(Landroid/util/Size;I)Landroid/util/Size;
    .locals 1

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0, p2}, Landroidx/camera/camera2/internal/i2;->G(I)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 2
    new-instance p2, Landroid/util/Size;

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result v0

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p1

    invoke-direct {p2, v0, p1}, Landroid/util/Size;-><init>(II)V

    move-object p1, p2

    :cond_0
    return-object p1
.end method

.method private h()V
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/i2;->q()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 2
    iget v0, p0, Landroidx/camera/camera2/internal/i2;->h:I

    const/4 v1, 0x3

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    if-eq v0, v2, :cond_0

    if-ne v0, v1, :cond_1

    .line 3
    :cond_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/i2;->s()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 4
    :cond_1
    iget v0, p0, Landroidx/camera/camera2/internal/i2;->h:I

    if-eq v0, v2, :cond_2

    if-ne v0, v1, :cond_3

    .line 5
    :cond_2
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/i2;->p()Ljava/util/List;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 6
    :cond_3
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    sget-object v3, Landroid/hardware/camera2/CameraCharacteristics;->REQUEST_AVAILABLE_CAPABILITIES:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 7
    invoke-virtual {v0, v3}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [I

    if-eqz v0, :cond_6

    .line 8
    array-length v3, v0

    const/4 v4, 0x0

    :goto_0
    if-ge v4, v3, :cond_6

    aget v5, v0, v4

    if-ne v5, v1, :cond_4

    .line 9
    iput-boolean v2, p0, Landroidx/camera/camera2/internal/i2;->k:Z

    goto :goto_1

    :cond_4
    const/4 v6, 0x6

    if-ne v5, v6, :cond_5

    .line 10
    iput-boolean v2, p0, Landroidx/camera/camera2/internal/i2;->l:Z

    :cond_5
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 11
    :cond_6
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/i2;->k:Z

    if-eqz v0, :cond_7

    .line 12
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/i2;->u()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 13
    :cond_7
    iget-boolean v0, p0, Landroidx/camera/camera2/internal/i2;->l:Z

    if-eqz v0, :cond_8

    iget v0, p0, Landroidx/camera/camera2/internal/i2;->h:I

    if-nez v0, :cond_8

    .line 14
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/i2;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 15
    :cond_8
    iget v0, p0, Landroidx/camera/camera2/internal/i2;->h:I

    if-ne v0, v1, :cond_9

    .line 16
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    invoke-virtual {p0}, Landroidx/camera/camera2/internal/i2;->r()Ljava/util/List;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 17
    :cond_9
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->g:Lu/e;

    iget-object v2, p0, Landroidx/camera/camera2/internal/i2;->c:Ljava/lang/String;

    iget v3, p0, Landroidx/camera/camera2/internal/i2;->h:I

    .line 18
    invoke-virtual {v1, v2, v3}, Lu/e;->a(Ljava/lang/String;I)Ljava/util/List;

    move-result-object v1

    .line 19
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method private i()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    .line 2
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->o:Landroidx/camera/camera2/internal/v1;

    invoke-virtual {v1}, Landroidx/camera/camera2/internal/v1;->d()Landroid/util/Size;

    move-result-object v1

    .line 3
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->v()Landroid/util/Size;

    move-result-object v2

    .line 4
    invoke-static {v0, v1, v2}, Lw/i2;->a(Landroid/util/Size;Landroid/util/Size;Landroid/util/Size;)Lw/i2;

    move-result-object v0

    iput-object v0, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    return-void
.end method

.method private j(I)[Landroid/util/Size;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->n:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/util/Size;

    if-nez v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i2;->c(I)[Landroid/util/Size;

    move-result-object v0

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->n:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-object v0
.end method

.method private k(Ljava/util/List;)Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;>;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    .line 2
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    mul-int v2, v2, v3

    goto :goto_0

    :cond_0
    if-eqz v2, :cond_5

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_1
    if-ge v4, v2, :cond_1

    .line 4
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 5
    invoke-interface {v0, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 6
    :cond_1
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    div-int v4, v2, v4

    move v6, v2

    const/4 v5, 0x0

    .line 7
    :goto_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    if-ge v5, v7, :cond_4

    .line 8
    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v2, :cond_2

    .line 9
    invoke-interface {v0, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    .line 10
    rem-int v10, v8, v6

    div-int/2addr v10, v4

    .line 11
    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/util/Size;

    .line 12
    invoke-interface {v9, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    .line 13
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v1

    if-ge v5, v7, :cond_3

    add-int/lit8 v6, v5, 0x1

    .line 14
    invoke-interface {p1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    div-int v6, v4, v6

    move v11, v6

    move v6, v4

    move v4, v11

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    return-object v0

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed to find supported resolutions."

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static l(Landroid/util/Size;)I
    .locals 1

    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result p0

    mul-int v0, v0, p0

    return v0
.end method

.method private n(I)Lw/h2$b;
    .locals 1

    const/16 v0, 0x23

    if-ne p1, v0, :cond_0

    .line 1
    sget-object p1, Lw/h2$b;->o:Lw/h2$b;

    return-object p1

    :cond_0
    const/16 v0, 0x100

    if-ne p1, v0, :cond_1

    .line 2
    sget-object p1, Lw/h2$b;->p:Lw/h2$b;

    return-object p1

    :cond_1
    const/16 v0, 0x20

    if-ne p1, v0, :cond_2

    .line 3
    sget-object p1, Lw/h2$b;->q:Lw/h2$b;

    return-object p1

    .line 4
    :cond_2
    sget-object p1, Lw/h2$b;->n:Lw/h2$b;

    return-object p1
.end method

.method private o(ILw/f1;)[Landroid/util/Size;
    .locals 3

    const/4 v0, 0x0

    .line 1
    invoke-interface {p2, v0}, Lw/f1;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_1

    .line 2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 3
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ne v2, p1, :cond_0

    .line 4
    iget-object p2, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, [Landroid/util/Size;

    :cond_1
    if-eqz v0, :cond_2

    .line 5
    invoke-direct {p0, v0, p1}, Landroidx/camera/camera2/internal/i2;->d([Landroid/util/Size;I)[Landroid/util/Size;

    move-result-object v0

    .line 6
    new-instance p1, Landroidx/camera/core/impl/utils/c;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroidx/camera/core/impl/utils/c;-><init>(Z)V

    invoke-static {v0, p1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    :cond_2
    return-object v0
.end method

.method private v()Landroid/util/Size;
    .locals 4

    .line 1
    :try_start_0
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->c:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v1, 0x0

    .line 2
    iget-object v2, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    const/4 v3, 0x1

    invoke-interface {v2, v0, v3}, Landroidx/camera/camera2/internal/c;->b(II)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    invoke-interface {v1, v0, v3}, Landroidx/camera/camera2/internal/c;->a(II)Landroid/media/CamcorderProfile;

    move-result-object v1

    :cond_0
    if-eqz v1, :cond_1

    .line 4
    new-instance v0, Landroid/util/Size;

    iget v2, v1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget v1, v1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {v0, v2, v1}, Landroid/util/Size;-><init>(II)V

    return-object v0

    .line 5
    :cond_1
    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/i2;->w(I)Landroid/util/Size;

    move-result-object v0

    return-object v0

    .line 6
    :catch_0
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->x()Landroid/util/Size;

    move-result-object v0

    return-object v0
.end method

.method private w(I)Landroid/util/Size;
    .locals 3

    .line 1
    sget-object v0, Landroidx/camera/camera2/internal/i2;->t:Landroid/util/Size;

    .line 2
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    const/16 v2, 0xa

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->b(II)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    .line 4
    :cond_0
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    const/16 v2, 0x8

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->b(II)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    const/16 v2, 0xc

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->b(II)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    .line 8
    :cond_2
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    const/4 v2, 0x6

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->b(II)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    .line 10
    :cond_3
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    const/4 v2, 0x5

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->b(II)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    .line 12
    :cond_4
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    const/4 v2, 0x4

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->b(II)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    iget-object v1, p0, Landroidx/camera/camera2/internal/i2;->d:Landroidx/camera/camera2/internal/c;

    invoke-interface {v1, p1, v2}, Landroidx/camera/camera2/internal/c;->a(II)Landroid/media/CamcorderProfile;

    move-result-object p1

    goto :goto_0

    :cond_5
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_6

    .line 14
    new-instance v0, Landroid/util/Size;

    iget v1, p1, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    iget p1, p1, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    invoke-direct {v0, v1, p1}, Landroid/util/Size;-><init>(II)V

    :cond_6
    return-object v0
.end method

.method private x()Landroid/util/Size;
    .locals 7

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->e:Lr/z;

    sget-object v1, Landroid/hardware/camera2/CameraCharacteristics;->SCALER_STREAM_CONFIGURATION_MAP:Landroid/hardware/camera2/CameraCharacteristics$Key;

    .line 2
    invoke-virtual {v0, v1}, Lr/z;->a(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/camera2/params/StreamConfigurationMap;

    if-eqz v0, :cond_3

    .line 3
    const-class v1, Landroid/media/MediaRecorder;

    invoke-virtual {v0, v1}, Landroid/hardware/camera2/params/StreamConfigurationMap;->getOutputSizes(Ljava/lang/Class;)[Landroid/util/Size;

    move-result-object v0

    if-nez v0, :cond_0

    .line 4
    sget-object v0, Landroidx/camera/camera2/internal/i2;->t:Landroid/util/Size;

    return-object v0

    .line 5
    :cond_0
    new-instance v1, Landroidx/camera/core/impl/utils/c;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, Landroidx/camera/core/impl/utils/c;-><init>(Z)V

    invoke-static {v0, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 6
    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 7
    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v4

    sget-object v5, Landroidx/camera/camera2/internal/i2;->s:Landroid/util/Size;

    invoke-virtual {v5}, Landroid/util/Size;->getWidth()I

    move-result v6

    if-gt v4, v6, :cond_1

    .line 8
    invoke-virtual {v3}, Landroid/util/Size;->getHeight()I

    move-result v4

    invoke-virtual {v5}, Landroid/util/Size;->getHeight()I

    move-result v5

    if-gt v4, v5, :cond_1

    return-object v3

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 9
    :cond_2
    sget-object v0, Landroidx/camera/camera2/internal/i2;->t:Landroid/util/Size;

    return-object v0

    .line 10
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can not retrieve SCALER_STREAM_CONFIGURATION_MAP"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method L(ILandroid/util/Size;)Lw/h2;
    .locals 5

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i2;->n(I)Lw/h2$b;

    move-result-object v0

    .line 2
    sget-object v1, Lw/h2$a;->s:Lw/h2$a;

    .line 3
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i2;->f(I)Landroid/util/Size;

    move-result-object p1

    .line 4
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int v2, v2, v3

    iget-object v3, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 5
    invoke-virtual {v3}, Lw/i2;->b()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 6
    invoke-virtual {v4}, Lw/i2;->b()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    mul-int v3, v3, v4

    if-gt v2, v3, :cond_0

    .line 7
    sget-object v1, Lw/h2$a;->o:Lw/h2$a;

    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int v2, v2, v3

    iget-object v3, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 9
    invoke-virtual {v3}, Lw/i2;->c()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 10
    invoke-virtual {v4}, Lw/i2;->c()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    mul-int v3, v3, v4

    if-gt v2, v3, :cond_1

    .line 11
    sget-object v1, Lw/h2$a;->p:Lw/h2$a;

    goto :goto_0

    .line 12
    :cond_1
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result v3

    mul-int v2, v2, v3

    iget-object v3, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 13
    invoke-virtual {v3}, Lw/i2;->d()Landroid/util/Size;

    move-result-object v3

    invoke-virtual {v3}, Landroid/util/Size;->getWidth()I

    move-result v3

    iget-object v4, p0, Landroidx/camera/camera2/internal/i2;->m:Lw/i2;

    .line 14
    invoke-virtual {v4}, Lw/i2;->d()Landroid/util/Size;

    move-result-object v4

    invoke-virtual {v4}, Landroid/util/Size;->getHeight()I

    move-result v4

    mul-int v3, v3, v4

    if-gt v2, v3, :cond_2

    .line 15
    sget-object v1, Lw/h2$a;->q:Lw/h2$a;

    goto :goto_0

    .line 16
    :cond_2
    invoke-virtual {p2}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p2}, Landroid/util/Size;->getHeight()I

    move-result p2

    mul-int v2, v2, p2

    invoke-virtual {p1}, Landroid/util/Size;->getWidth()I

    move-result p2

    invoke-virtual {p1}, Landroid/util/Size;->getHeight()I

    move-result p1

    mul-int p2, p2, p1

    if-gt v2, p2, :cond_3

    .line 17
    sget-object v1, Lw/h2$a;->r:Lw/h2$a;

    .line 18
    :cond_3
    :goto_0
    invoke-static {v0, v1}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object p1

    return-object p1
.end method

.method b(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/h2;",
            ">;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lw/g2;

    .line 2
    invoke-virtual {v1, p1}, Lw/g2;->d(Ljava/util/List;)Z

    move-result v1

    if-eqz v1, :cond_0

    :cond_1
    return v1
.end method

.method m()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 3
    sget-object v2, Lw/h2$b;->n:Lw/h2$b;

    sget-object v3, Lw/h2$a;->p:Lw/h2$a;

    .line 4
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 5
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 6
    sget-object v4, Lw/h2$a;->r:Lw/h2$a;

    .line 7
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 8
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 11
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 12
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 13
    sget-object v2, Lw/h2$b;->o:Lw/h2$b;

    .line 14
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 15
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 18
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v3

    .line 19
    invoke-virtual {v1, v3}, Lw/g2;->a(Lw/h2;)Z

    .line 20
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 21
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method p()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 3
    sget-object v2, Lw/h2$b;->n:Lw/h2$b;

    sget-object v3, Lw/h2$a;->p:Lw/h2$a;

    .line 4
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 5
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 6
    sget-object v4, Lw/h2$a;->r:Lw/h2$a;

    .line 7
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 8
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 11
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 12
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 13
    sget-object v5, Lw/h2$b;->o:Lw/h2$b;

    .line 14
    invoke-static {v5, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 15
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 18
    invoke-static {v5, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 19
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 20
    invoke-static {v5, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 21
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 24
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 25
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 26
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 27
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 28
    sget-object v6, Lw/h2$b;->p:Lw/h2$b;

    .line 29
    invoke-static {v6, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 30
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 33
    sget-object v6, Lw/h2$a;->o:Lw/h2$a;

    .line 34
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 35
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 36
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 38
    invoke-static {v5, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 39
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 40
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 41
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 42
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 43
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 44
    invoke-static {v5, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 45
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 46
    invoke-static {v5, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method q()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 3
    sget-object v2, Lw/h2$b;->n:Lw/h2$b;

    sget-object v3, Lw/h2$a;->r:Lw/h2$a;

    .line 4
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 5
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 8
    sget-object v4, Lw/h2$b;->p:Lw/h2$b;

    .line 9
    invoke-static {v4, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 10
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 11
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 13
    sget-object v5, Lw/h2$b;->o:Lw/h2$b;

    .line 14
    invoke-static {v5, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 15
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 18
    sget-object v6, Lw/h2$a;->p:Lw/h2$a;

    .line 19
    invoke-static {v2, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 20
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 21
    invoke-static {v4, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 22
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 23
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 24
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 25
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 26
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 27
    invoke-static {v4, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 28
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 31
    invoke-static {v2, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 32
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 33
    invoke-static {v2, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 34
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 35
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 36
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 37
    invoke-static {v2, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 38
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 39
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 40
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 41
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 42
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 43
    invoke-static {v2, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 45
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 46
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 47
    invoke-static {v4, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 48
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 49
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method r()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 3
    sget-object v2, Lw/h2$b;->n:Lw/h2$b;

    sget-object v3, Lw/h2$a;->p:Lw/h2$a;

    .line 4
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 5
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 6
    sget-object v4, Lw/h2$a;->o:Lw/h2$a;

    .line 7
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 8
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 9
    sget-object v5, Lw/h2$b;->o:Lw/h2$b;

    sget-object v6, Lw/h2$a;->r:Lw/h2$a;

    .line 10
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 11
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 12
    sget-object v5, Lw/h2$b;->q:Lw/h2$b;

    .line 13
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 14
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 15
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 17
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v3

    .line 18
    invoke-virtual {v1, v3}, Lw/g2;->a(Lw/h2;)Z

    .line 19
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 20
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 21
    sget-object v2, Lw/h2$b;->p:Lw/h2$b;

    .line 22
    invoke-static {v2, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 24
    invoke-static {v5, v6}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 25
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 26
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method s()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 3
    sget-object v2, Lw/h2$b;->n:Lw/h2$b;

    sget-object v3, Lw/h2$a;->p:Lw/h2$a;

    .line 4
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 5
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 6
    sget-object v4, Lw/h2$a;->q:Lw/h2$a;

    .line 7
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 8
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 9
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 10
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 11
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 12
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 13
    sget-object v5, Lw/h2$b;->o:Lw/h2$b;

    .line 14
    invoke-static {v5, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 15
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 16
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 17
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 18
    invoke-static {v5, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 19
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 20
    invoke-static {v5, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 21
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 22
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 23
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 24
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 25
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 26
    invoke-static {v2, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 27
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 28
    sget-object v6, Lw/h2$b;->p:Lw/h2$b;

    .line 29
    invoke-static {v6, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 30
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 31
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 33
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 34
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 35
    invoke-static {v5, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 36
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 37
    invoke-static {v6, v4}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 38
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 39
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 40
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 41
    invoke-static {v5, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 42
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 43
    invoke-static {v5, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 44
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 45
    sget-object v2, Lw/h2$a;->r:Lw/h2$a;

    .line 46
    invoke-static {v6, v2}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 47
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 48
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method t(I)Landroid/util/Size;
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i2;->j(I)[Landroid/util/Size;

    move-result-object p1

    .line 2
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    new-instance v0, Landroidx/camera/core/impl/utils/c;

    invoke-direct {v0}, Landroidx/camera/core/impl/utils/c;-><init>()V

    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/util/Size;

    return-object p1
.end method

.method u()Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lw/g2;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 3
    sget-object v2, Lw/h2$b;->q:Lw/h2$b;

    sget-object v3, Lw/h2$a;->r:Lw/h2$a;

    .line 4
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 5
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 6
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 7
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 8
    sget-object v4, Lw/h2$b;->n:Lw/h2$b;

    sget-object v5, Lw/h2$a;->p:Lw/h2$a;

    .line 9
    invoke-static {v4, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 10
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 11
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v6

    .line 12
    invoke-virtual {v1, v6}, Lw/g2;->a(Lw/h2;)Z

    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 15
    sget-object v6, Lw/h2$b;->o:Lw/h2$b;

    .line 16
    invoke-static {v6, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 17
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 18
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 19
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 20
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 21
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 22
    invoke-static {v4, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 23
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 24
    invoke-static {v4, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 25
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 26
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 27
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 28
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 30
    invoke-static {v4, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 31
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 32
    invoke-static {v6, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 33
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 34
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 35
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 36
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 38
    invoke-static {v6, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 39
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 40
    invoke-static {v6, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 41
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 42
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 43
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 44
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 45
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 46
    invoke-static {v4, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 47
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 48
    sget-object v4, Lw/h2$b;->p:Lw/h2$b;

    .line 49
    invoke-static {v4, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 50
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 51
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v7

    .line 52
    invoke-virtual {v1, v7}, Lw/g2;->a(Lw/h2;)Z

    .line 53
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 54
    new-instance v1, Lw/g2;

    invoke-direct {v1}, Lw/g2;-><init>()V

    .line 55
    invoke-static {v6, v5}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v5

    .line 56
    invoke-virtual {v1, v5}, Lw/g2;->a(Lw/h2;)Z

    .line 57
    invoke-static {v4, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v4

    .line 58
    invoke-virtual {v1, v4}, Lw/g2;->a(Lw/h2;)Z

    .line 59
    invoke-static {v2, v3}, Lw/h2;->a(Lw/h2$b;Lw/h2$a;)Lw/h2;

    move-result-object v2

    .line 60
    invoke-virtual {v1, v2}, Lw/g2;->a(Lw/h2;)Z

    .line 61
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method y(Ljava/util/List;Ljava/util/List;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lw/h2;",
            ">;",
            "Ljava/util/List<",
            "Lw/o2<",
            "*>;>;)",
            "Ljava/util/Map<",
            "Lw/o2<",
            "*>;",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Landroidx/camera/camera2/internal/i2;->J()V

    .line 2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 3
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lw/o2;

    .line 4
    invoke-interface {v2}, Lw/d1;->q()I

    move-result v2

    new-instance v3, Landroid/util/Size;

    const/16 v4, 0x280

    const/16 v5, 0x1e0

    invoke-direct {v3, v4, v5}, Landroid/util/Size;-><init>(II)V

    invoke-virtual {p0, v2, v3}, Landroidx/camera/camera2/internal/i2;->L(ILandroid/util/Size;)Lw/h2;

    move-result-object v2

    .line 5
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/i2;->b(Ljava/util/List;)Z

    move-result v0

    const-string v1, " New configs: "

    const-string v2, "No supported surface combination is found for camera device - Id : "

    if-eqz v0, :cond_6

    .line 7
    invoke-direct {p0, p2}, Landroidx/camera/camera2/internal/i2;->C(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    .line 8
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 9
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    .line 10
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lw/o2;

    invoke-virtual {p0, v5}, Landroidx/camera/camera2/internal/i2;->z(Lw/o2;)Ljava/util/List;

    move-result-object v5

    .line 11
    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 12
    :cond_1
    invoke-direct {p0, v3}, Landroidx/camera/camera2/internal/i2;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    const/4 v4, 0x0

    .line 13
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    .line 14
    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v7, 0x0

    .line 15
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_3

    .line 16
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/util/Size;

    .line 17
    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    invoke-interface {p2, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lw/o2;

    .line 18
    invoke-interface {v9}, Lw/d1;->q()I

    move-result v9

    invoke-virtual {p0, v9, v8}, Landroidx/camera/camera2/internal/i2;->L(ILandroid/util/Size;)Lw/h2;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    .line 19
    :cond_3
    invoke-virtual {p0, v6}, Landroidx/camera/camera2/internal/i2;->b(Ljava/util/List;)Z

    move-result v6

    if-eqz v6, :cond_2

    .line 20
    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    .line 21
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lw/o2;

    .line 22
    invoke-interface {p2, v6}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    .line 23
    invoke-interface {v0, v7}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v7

    .line 24
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/util/Size;

    .line 25
    invoke-interface {v4, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_4
    if-eqz v4, :cond_5

    return-object v4

    .line 26
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/i2;->c:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " and Hardware level: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, Landroidx/camera/camera2/internal/i2;->h:I

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ". May be the specified resolution is too large and not supported. Existing surfaces: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 27
    :cond_6
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Landroidx/camera/camera2/internal/i2;->c:Ljava/lang/String;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ".  May be attempting to bind too many use cases. Existing surfaces: "

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method z(Lw/o2;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lw/o2<",
            "*>;)",
            "Ljava/util/List<",
            "Landroid/util/Size;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-interface {p1}, Lw/d1;->q()I

    move-result v0

    .line 2
    move-object v1, p1

    check-cast v1, Lw/f1;

    .line 3
    invoke-direct {p0, v0, v1}, Landroidx/camera/camera2/internal/i2;->o(ILw/f1;)[Landroid/util/Size;

    move-result-object v2

    if-nez v2, :cond_0

    .line 4
    invoke-direct {p0, v0}, Landroidx/camera/camera2/internal/i2;->j(I)[Landroid/util/Size;

    move-result-object v2

    .line 5
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    .line 6
    invoke-interface {v1, v4}, Lw/f1;->f(Landroid/util/Size;)Landroid/util/Size;

    move-result-object v5

    .line 7
    invoke-virtual {p0, v0}, Landroidx/camera/camera2/internal/i2;->t(I)Landroid/util/Size;

    move-result-object v6

    if-eqz v5, :cond_1

    .line 8
    invoke-static {v6}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v7

    invoke-static {v5}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v8

    if-ge v7, v8, :cond_2

    :cond_1
    move-object v5, v6

    .line 9
    :cond_2
    new-instance v6, Landroidx/camera/core/impl/utils/c;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Landroidx/camera/core/impl/utils/c;-><init>(Z)V

    invoke-static {v2, v6}, Ljava/util/Arrays;->sort([Ljava/lang/Object;Ljava/util/Comparator;)V

    .line 10
    invoke-direct {p0, v1}, Landroidx/camera/camera2/internal/i2;->B(Lw/f1;)Landroid/util/Size;

    move-result-object v6

    .line 11
    sget-object v7, Landroidx/camera/camera2/internal/i2;->q:Landroid/util/Size;

    .line 12
    invoke-static {v7}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v8

    .line 13
    invoke-static {v5}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v9

    if-ge v9, v8, :cond_3

    .line 14
    sget-object v7, Landroidx/camera/camera2/internal/i2;->r:Landroid/util/Size;

    goto :goto_0

    :cond_3
    if-eqz v6, :cond_4

    .line 15
    invoke-static {v6}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v9

    if-ge v9, v8, :cond_4

    move-object v7, v6

    .line 16
    :cond_4
    :goto_0
    array-length v8, v2

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_6

    aget-object v10, v2, v9

    .line 17
    invoke-static {v10}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v11

    invoke-static {v5}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v12

    if-gt v11, v12, :cond_5

    invoke-static {v10}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v11

    invoke-static {v7}, Landroidx/camera/camera2/internal/i2;->l(Landroid/util/Size;)I

    move-result v12

    if-lt v11, v12, :cond_5

    .line 18
    invoke-interface {v3, v10}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    .line 19
    invoke-interface {v3, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    .line 20
    :cond_6
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_d

    .line 21
    invoke-direct {p0, v1}, Landroidx/camera/camera2/internal/i2;->A(Lw/f1;)Landroid/util/Rational;

    move-result-object v0

    if-nez v6, :cond_7

    .line 22
    invoke-interface {v1, v4}, Lw/f1;->u(Landroid/util/Size;)Landroid/util/Size;

    move-result-object v6

    .line 23
    :cond_7
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 24
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    if-nez v0, :cond_8

    .line 25
    invoke-interface {v1, v3}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    if-eqz v6, :cond_c

    .line 26
    invoke-direct {p0, v1, v6}, Landroidx/camera/camera2/internal/i2;->K(Ljava/util/List;Landroid/util/Size;)V

    goto :goto_4

    .line 27
    :cond_8
    invoke-direct {p0, v3}, Landroidx/camera/camera2/internal/i2;->D(Ljava/util/List;)Ljava/util/Map;

    move-result-object v2

    if-eqz v6, :cond_9

    .line 28
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Rational;

    .line 29
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-direct {p0, v4, v6}, Landroidx/camera/camera2/internal/i2;->K(Ljava/util/List;Landroid/util/Size;)V

    goto :goto_2

    .line 30
    :cond_9
    new-instance v3, Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 31
    new-instance v4, Landroidx/camera/camera2/internal/i2$a;

    invoke-direct {v4, v0}, Landroidx/camera/camera2/internal/i2$a;-><init>(Landroid/util/Rational;)V

    invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 32
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/util/Rational;

    .line 33
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_b
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/util/Size;

    .line 34
    invoke-interface {v1, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    .line 35
    invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 36
    :cond_c
    :goto_4
    iget-object v0, p0, Landroidx/camera/camera2/internal/i2;->p:Lu/n;

    .line 37
    invoke-interface {p1}, Lw/d1;->q()I

    move-result p1

    invoke-direct {p0, p1}, Landroidx/camera/camera2/internal/i2;->n(I)Lw/h2$b;

    move-result-object p1

    .line 38
    invoke-virtual {v0, p1, v1}, Lu/n;->a(Lw/h2$b;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1

    .line 39
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Can not get supported output size under supported maximum for the format: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
