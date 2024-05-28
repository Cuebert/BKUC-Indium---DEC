.class final Lgc/m$h;
.super Lxa/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lgc/m;->d(Ljava/lang/Exception;Lva/c;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lxa/e;
    c = "retrofit2.KotlinExtensions"
    f = "KotlinExtensions.kt"
    l = {
        0x71
    }
    m = "suspendAndThrow"
.end annotation


# instance fields
.field synthetic q:Ljava/lang/Object;

.field r:I

.field s:Ljava/lang/Object;


# direct methods
.method constructor <init>(Lva/c;)V
    .locals 0

    invoke-direct {p0, p1}, Lxa/c;-><init>(Lva/c;)V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lgc/m$h;->q:Ljava/lang/Object;

    iget p1, p0, Lgc/m$h;->r:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lgc/m$h;->r:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lgc/m;->d(Ljava/lang/Exception;Lva/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
