.class public final Landroidx/camera/core/d3$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/d3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field private static final a:Landroid/util/Size;

.field private static final b:Lw/q2;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x780

    const/16 v2, 0x438

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/core/d3$d;->a:Landroid/util/Size;

    .line 2
    new-instance v1, Landroidx/camera/core/d3$c;

    invoke-direct {v1}, Landroidx/camera/core/d3$c;-><init>()V

    const/16 v2, 0x1e

    .line 3
    invoke-virtual {v1, v2}, Landroidx/camera/core/d3$c;->p(I)Landroidx/camera/core/d3$c;

    move-result-object v1

    const/high16 v2, 0x800000

    .line 4
    invoke-virtual {v1, v2}, Landroidx/camera/core/d3$c;->i(I)Landroidx/camera/core/d3$c;

    move-result-object v1

    const/4 v2, 0x1

    .line 5
    invoke-virtual {v1, v2}, Landroidx/camera/core/d3$c;->j(I)Landroidx/camera/core/d3$c;

    move-result-object v1

    const v3, 0xfa00

    .line 6
    invoke-virtual {v1, v3}, Landroidx/camera/core/d3$c;->e(I)Landroidx/camera/core/d3$c;

    move-result-object v1

    const/16 v3, 0x1f40

    .line 7
    invoke-virtual {v1, v3}, Landroidx/camera/core/d3$c;->h(I)Landroidx/camera/core/d3$c;

    move-result-object v1

    .line 8
    invoke-virtual {v1, v2}, Landroidx/camera/core/d3$c;->f(I)Landroidx/camera/core/d3$c;

    move-result-object v1

    const/16 v3, 0x400

    .line 9
    invoke-virtual {v1, v3}, Landroidx/camera/core/d3$c;->g(I)Landroidx/camera/core/d3$c;

    move-result-object v1

    .line 10
    invoke-virtual {v1, v0}, Landroidx/camera/core/d3$c;->k(Landroid/util/Size;)Landroidx/camera/core/d3$c;

    move-result-object v0

    const/4 v1, 0x3

    .line 11
    invoke-virtual {v0, v1}, Landroidx/camera/core/d3$c;->l(I)Landroidx/camera/core/d3$c;

    move-result-object v0

    .line 12
    invoke-virtual {v0, v2}, Landroidx/camera/core/d3$c;->m(I)Landroidx/camera/core/d3$c;

    move-result-object v0

    .line 13
    invoke-virtual {v0}, Landroidx/camera/core/d3$c;->d()Lw/q2;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/d3$d;->b:Lw/q2;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lw/q2;
    .locals 1

    sget-object v0, Landroidx/camera/core/d3$d;->b:Lw/q2;

    return-object v0
.end method
