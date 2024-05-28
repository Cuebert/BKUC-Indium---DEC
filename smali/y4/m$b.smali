.class Ly4/m$b;
.super Ly4/m$g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final b:Ly4/m$d;


# direct methods
.method public constructor <init>(Ly4/m$d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ly4/m$g;-><init>()V

    .line 2
    iput-object p1, p0, Ly4/m$b;->b:Ly4/m$d;

    return-void
.end method


# virtual methods
.method public a(Landroid/graphics/Matrix;Lx4/a;ILandroid/graphics/Canvas;)V
    .locals 8

    .line 1
    iget-object v0, p0, Ly4/m$b;->b:Ly4/m$d;

    invoke-static {v0}, Ly4/m$d;->h(Ly4/m$d;)F

    move-result v6

    .line 2
    iget-object v0, p0, Ly4/m$b;->b:Ly4/m$d;

    invoke-static {v0}, Ly4/m$d;->i(Ly4/m$d;)F

    move-result v7

    .line 3
    new-instance v4, Landroid/graphics/RectF;

    iget-object v0, p0, Ly4/m$b;->b:Ly4/m$d;

    .line 4
    invoke-static {v0}, Ly4/m$d;->b(Ly4/m$d;)F

    move-result v0

    iget-object v1, p0, Ly4/m$b;->b:Ly4/m$d;

    invoke-static {v1}, Ly4/m$d;->c(Ly4/m$d;)F

    move-result v1

    iget-object v2, p0, Ly4/m$b;->b:Ly4/m$d;

    invoke-static {v2}, Ly4/m$d;->d(Ly4/m$d;)F

    move-result v2

    iget-object v3, p0, Ly4/m$b;->b:Ly4/m$d;

    invoke-static {v3}, Ly4/m$d;->e(Ly4/m$d;)F

    move-result v3

    invoke-direct {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object v1, p2

    move-object v2, p4

    move-object v3, p1

    move v5, p3

    .line 5
    invoke-virtual/range {v1 .. v7}, Lx4/a;->a(Landroid/graphics/Canvas;Landroid/graphics/Matrix;Landroid/graphics/RectF;IFF)V

    return-void
.end method
