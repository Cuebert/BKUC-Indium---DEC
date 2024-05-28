.class public final Landroidx/camera/core/z1$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/z1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field private static final a:Lw/w1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroidx/camera/core/z1$b;

    invoke-direct {v0}, Landroidx/camera/core/z1$b;-><init>()V

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Landroidx/camera/core/z1$b;->f(I)Landroidx/camera/core/z1$b;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-virtual {v0, v1}, Landroidx/camera/core/z1$b;->g(I)Landroidx/camera/core/z1$b;

    move-result-object v0

    .line 3
    invoke-virtual {v0}, Landroidx/camera/core/z1$b;->e()Lw/w1;

    move-result-object v0

    sput-object v0, Landroidx/camera/core/z1$c;->a:Lw/w1;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lw/w1;
    .locals 1

    sget-object v0, Landroidx/camera/core/z1$c;->a:Lw/w1;

    return-object v0
.end method
