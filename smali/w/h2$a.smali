.class public final enum Lw/h2$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/h2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw/h2$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lw/h2$a;

.field public static final enum p:Lw/h2$a;

.field public static final enum q:Lw/h2$a;

.field public static final enum r:Lw/h2$a;

.field public static final enum s:Lw/h2$a;

.field private static final synthetic t:[Lw/h2$a;


# instance fields
.field final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lw/h2$a;

    const-string v1, "ANALYSIS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lw/h2$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lw/h2$a;->o:Lw/h2$a;

    .line 2
    new-instance v1, Lw/h2$a;

    const-string v3, "PREVIEW"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lw/h2$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lw/h2$a;->p:Lw/h2$a;

    .line 3
    new-instance v3, Lw/h2$a;

    const-string v5, "RECORD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lw/h2$a;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lw/h2$a;->q:Lw/h2$a;

    .line 4
    new-instance v5, Lw/h2$a;

    const-string v7, "MAXIMUM"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8, v8}, Lw/h2$a;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lw/h2$a;->r:Lw/h2$a;

    .line 5
    new-instance v7, Lw/h2$a;

    const-string v9, "NOT_SUPPORT"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10, v10}, Lw/h2$a;-><init>(Ljava/lang/String;II)V

    sput-object v7, Lw/h2$a;->s:Lw/h2$a;

    const/4 v9, 0x5

    new-array v9, v9, [Lw/h2$a;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    .line 6
    sput-object v9, Lw/h2$a;->t:[Lw/h2$a;

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
    iput p3, p0, Lw/h2$a;->n:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lw/h2$a;
    .locals 1

    const-class v0, Lw/h2$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw/h2$a;

    return-object p0
.end method

.method public static values()[Lw/h2$a;
    .locals 1

    sget-object v0, Lw/h2$a;->t:[Lw/h2$a;

    invoke-virtual {v0}, [Lw/h2$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw/h2$a;

    return-object v0
.end method


# virtual methods
.method b()I
    .locals 1

    iget v0, p0, Lw/h2$a;->n:I

    return v0
.end method
