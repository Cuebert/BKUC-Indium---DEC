.class public final Landroidx/camera/core/n0$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/n0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field private static final a:Landroid/util/Size;

.field private static final b:Lw/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Landroid/util/Size;

    const/16 v1, 0x280

    const/16 v2, 0x1e0

    invoke-direct {v0, v1, v2}, Landroid/util/Size;-><init>(II)V

    sput-object v0, Landroidx/camera/core/n0$d;->a:Landroid/util/Size;

    .line 2
    new-instance v1, Landroidx/camera/core/n0$c;

    invoke-direct {v1}, Landroidx/camera/core/n0$c;-><init>()V

    .line 3
    invoke-virtual {v1, v0}, Landroidx/camera/core/n0$c;->g(Landroid/util/Size;)Landroidx/camera/core/n0$c;

    move-result-object v0

    const/4 v1, 0x1

    .line 4
    invoke-virtual {v0, v1}, Landroidx/camera/core/n0$c;->h(I)Landroidx/camera/core/n0$c;

    move-result-object v0

    const/4 v1, 0x0

    .line 5
    invoke-virtual {v0, v1}, Landroidx/camera/core/n0$c;->i(I)Landroidx/camera/core/n0$c;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Landroidx/camera/core/n0$c;->e()Lw/z0;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/n0$d;->b:Lw/z0;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lw/z0;
    .locals 1

    sget-object v0, Landroidx/camera/core/n0$d;->b:Lw/z0;

    return-object v0
.end method
