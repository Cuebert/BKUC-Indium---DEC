.class public final synthetic Lcom/google/mlkit/vision/barcode/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj5/h;


# static fields
.field public static final synthetic a:Lcom/google/mlkit/vision/barcode/internal/a;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/a;

    invoke-direct {v0}, Lcom/google/mlkit/vision/barcode/internal/a;-><init>()V

    sput-object v0, Lcom/google/mlkit/vision/barcode/internal/a;->a:Lcom/google/mlkit/vision/barcode/internal/a;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lj5/e;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lcom/google/mlkit/vision/barcode/internal/b;

    const-class v1, Lj6/d;

    .line 1
    invoke-interface {p1, v1}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj6/d;

    const-class v2, Lg6/d;

    .line 2
    invoke-interface {p1, v2}, Lj5/e;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lg6/d;

    invoke-direct {v0, v1, p1}, Lcom/google/mlkit/vision/barcode/internal/b;-><init>(Lj6/d;Lg6/d;)V

    return-object v0
.end method
