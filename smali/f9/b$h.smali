.class Lf9/b$h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "h"
.end annotation


# instance fields
.field private a:F

.field private b:F

.field private c:I

.field d:F

.field e:F

.field f:I

.field final synthetic g:Lf9/b;


# direct methods
.method constructor <init>(Lf9/b;)V
    .locals 0

    iput-object p1, p0, Lf9/b$h;->g:Lf9/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lf9/b$h;->c:I

    return v0
.end method

.method public b()F
    .locals 1

    iget v0, p0, Lf9/b$h;->a:F

    return v0
.end method

.method public c()F
    .locals 1

    iget v0, p0, Lf9/b$h;->b:F

    return v0
.end method

.method public d(I)V
    .locals 1

    .line 1
    iget v0, p0, Lf9/b$h;->c:I

    iput v0, p0, Lf9/b$h;->f:I

    .line 2
    iput p1, p0, Lf9/b$h;->c:I

    return-void
.end method

.method public e(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf9/b$h;->a:F

    iput v0, p0, Lf9/b$h;->d:F

    .line 2
    iput p1, p0, Lf9/b$h;->a:F

    return-void
.end method

.method public f(F)V
    .locals 1

    .line 1
    iget v0, p0, Lf9/b$h;->b:F

    iput v0, p0, Lf9/b$h;->e:F

    .line 2
    iput p1, p0, Lf9/b$h;->b:F

    return-void
.end method
