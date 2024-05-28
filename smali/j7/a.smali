.class public abstract Lj7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj7/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lj7/d<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected a:I

.field protected b:I

.field protected c:I

.field protected final d:F


# direct methods
.method public constructor <init>(IIF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lj7/a;->a:I

    .line 3
    iput p2, p0, Lj7/a;->c:I

    .line 4
    iput p3, p0, Lj7/a;->d:F

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    .line 1
    iget v0, p0, Lj7/a;->b:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lj7/a;->b:I

    .line 2
    iget v0, p0, Lj7/a;->a:I

    int-to-float v0, v0

    iget v1, p0, Lj7/a;->d:F

    mul-float v0, v0, v1

    float-to-int v0, v0

    iput v0, p0, Lj7/a;->a:I

    return-void
.end method

.method public b()Z
    .locals 2

    iget v0, p0, Lj7/a;->b:I

    iget v1, p0, Lj7/a;->c:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lj7/a;->a:I

    return v0
.end method
