.class public final enum Landroidx/camera/view/PreviewView$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/view/PreviewView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/camera/view/PreviewView$f;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Landroidx/camera/view/PreviewView$f;

.field public static final enum p:Landroidx/camera/view/PreviewView$f;

.field public static final enum q:Landroidx/camera/view/PreviewView$f;

.field public static final enum r:Landroidx/camera/view/PreviewView$f;

.field public static final enum s:Landroidx/camera/view/PreviewView$f;

.field public static final enum t:Landroidx/camera/view/PreviewView$f;

.field private static final synthetic u:[Landroidx/camera/view/PreviewView$f;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .line 1
    new-instance v0, Landroidx/camera/view/PreviewView$f;

    const-string v1, "FILL_START"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Landroidx/camera/view/PreviewView$f;-><init>(Ljava/lang/String;II)V

    sput-object v0, Landroidx/camera/view/PreviewView$f;->o:Landroidx/camera/view/PreviewView$f;

    .line 2
    new-instance v1, Landroidx/camera/view/PreviewView$f;

    const-string v3, "FILL_CENTER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Landroidx/camera/view/PreviewView$f;-><init>(Ljava/lang/String;II)V

    sput-object v1, Landroidx/camera/view/PreviewView$f;->p:Landroidx/camera/view/PreviewView$f;

    .line 3
    new-instance v3, Landroidx/camera/view/PreviewView$f;

    const-string v5, "FILL_END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Landroidx/camera/view/PreviewView$f;-><init>(Ljava/lang/String;II)V

    sput-object v3, Landroidx/camera/view/PreviewView$f;->q:Landroidx/camera/view/PreviewView$f;

    .line 4
    new-instance v5, Landroidx/camera/view/PreviewView$f;

    const-string v7, "FIT_START"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Landroidx/camera/view/PreviewView$f;-><init>(Ljava/lang/String;II)V

    sput-object v5, Landroidx/camera/view/PreviewView$f;->r:Landroidx/camera/view/PreviewView$f;

    .line 5
    new-instance v7, Landroidx/camera/view/PreviewView$f;

    const-string v9, "FIT_CENTER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Landroidx/camera/view/PreviewView$f;-><init>(Ljava/lang/String;II)V

    sput-object v7, Landroidx/camera/view/PreviewView$f;->s:Landroidx/camera/view/PreviewView$f;

    .line 6
    new-instance v9, Landroidx/camera/view/PreviewView$f;

    const-string v11, "FIT_END"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12, v12}, Landroidx/camera/view/PreviewView$f;-><init>(Ljava/lang/String;II)V

    sput-object v9, Landroidx/camera/view/PreviewView$f;->t:Landroidx/camera/view/PreviewView$f;

    const/4 v11, 0x6

    new-array v11, v11, [Landroidx/camera/view/PreviewView$f;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    .line 7
    sput-object v11, Landroidx/camera/view/PreviewView$f;->u:[Landroidx/camera/view/PreviewView$f;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput p3, p0, Landroidx/camera/view/PreviewView$f;->n:I

    return-void
.end method

.method static b(I)Landroidx/camera/view/PreviewView$f;
    .locals 5

    .line 1
    invoke-static {}, Landroidx/camera/view/PreviewView$f;->values()[Landroidx/camera/view/PreviewView$f;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    .line 2
    iget v4, v3, Landroidx/camera/view/PreviewView$f;->n:I

    if-ne v4, p0, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 3
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown scale type id "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/camera/view/PreviewView$f;
    .locals 1

    const-class v0, Landroidx/camera/view/PreviewView$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/camera/view/PreviewView$f;

    return-object p0
.end method

.method public static values()[Landroidx/camera/view/PreviewView$f;
    .locals 1

    sget-object v0, Landroidx/camera/view/PreviewView$f;->u:[Landroidx/camera/view/PreviewView$f;

    invoke-virtual {v0}, [Landroidx/camera/view/PreviewView$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/camera/view/PreviewView$f;

    return-object v0
.end method


# virtual methods
.method c()I
    .locals 1

    iget v0, p0, Landroidx/camera/view/PreviewView$f;->n:I

    return v0
.end method
