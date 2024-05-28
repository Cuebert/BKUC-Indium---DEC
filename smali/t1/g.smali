.class public final enum Lt1/g;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lt1/g;",
        ">;"
    }
.end annotation


# static fields
.field static final A:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "+",
            "Lt1/b;",
            ">;",
            "Lt1/g;",
            ">;"
        }
    .end annotation
.end field

.field static final B:I

.field private static final synthetic C:[Lt1/g;

.field public static final enum p:Lt1/g;

.field public static final enum q:Lt1/g;

.field public static final enum r:Lt1/g;

.field public static final enum s:Lt1/g;

.field public static final enum t:Lt1/g;

.field public static final enum u:Lt1/g;

.field public static final enum v:Lt1/g;

.field public static final enum w:Lt1/g;

.field public static final enum x:Lt1/g;

.field public static final enum y:Lt1/g;

.field public static final enum z:Lt1/g;


# instance fields
.field final n:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "+",
            "Lt1/b;",
            ">;"
        }
    .end annotation
.end field

.field final o:I


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lt1/g;

    const-class v1, Lu1/b;

    const-string v2, "CALLBACK"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v3}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v0, Lt1/g;->p:Lt1/g;

    .line 2
    new-instance v1, Lt1/g;

    const-class v2, Lu1/d;

    const-string v4, "CANCEL_RESULT_CALLBACK"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2, v3}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v1, Lt1/g;->q:Lt1/g;

    .line 3
    new-instance v2, Lt1/g;

    const-class v4, Lu1/i;

    const-string v6, "RUN_JOB"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4, v3}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v2, Lt1/g;->r:Lt1/g;

    .line 4
    new-instance v4, Lt1/g;

    const-class v6, Lu1/e;

    const-string v8, "COMMAND"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6, v3}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v4, Lt1/g;->s:Lt1/g;

    .line 5
    new-instance v6, Lt1/g;

    const-class v8, Lu1/h;

    const-string v10, "PUBLIC_QUERY"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8, v3}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v6, Lt1/g;->t:Lt1/g;

    .line 6
    new-instance v8, Lt1/g;

    const-class v10, Lu1/g;

    const-string v12, "JOB_CONSUMER_IDLE"

    const/4 v13, 0x5

    invoke-direct {v8, v12, v13, v10, v3}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v8, Lt1/g;->u:Lt1/g;

    .line 7
    new-instance v10, Lt1/g;

    const-class v12, Lu1/a;

    const-string v14, "ADD_JOB"

    const/4 v15, 0x6

    invoke-direct {v10, v14, v15, v12, v5}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v10, Lt1/g;->v:Lt1/g;

    .line 8
    new-instance v12, Lt1/g;

    const-class v14, Lu1/c;

    const-string v15, "CANCEL"

    const/4 v13, 0x7

    invoke-direct {v12, v15, v13, v14, v5}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v12, Lt1/g;->w:Lt1/g;

    .line 9
    new-instance v14, Lt1/g;

    const-class v15, Lu1/f;

    const-string v13, "CONSTRAINT_CHANGE"

    const/16 v5, 0x8

    invoke-direct {v14, v13, v5, v15, v7}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v14, Lt1/g;->x:Lt1/g;

    .line 10
    new-instance v13, Lt1/g;

    const-class v15, Lu1/j;

    const-string v5, "RUN_JOB_RESULT"

    const/16 v7, 0x9

    invoke-direct {v13, v5, v7, v15, v9}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v13, Lt1/g;->y:Lt1/g;

    .line 11
    new-instance v5, Lt1/g;

    const-class v15, Lu1/k;

    const-string v7, "SCHEDULER"

    const/16 v9, 0xa

    invoke-direct {v5, v7, v9, v15, v11}, Lt1/g;-><init>(Ljava/lang/String;ILjava/lang/Class;I)V

    sput-object v5, Lt1/g;->z:Lt1/g;

    const/16 v7, 0xb

    new-array v7, v7, [Lt1/g;

    aput-object v0, v7, v3

    const/4 v0, 0x1

    aput-object v1, v7, v0

    const/4 v0, 0x2

    aput-object v2, v7, v0

    const/4 v0, 0x3

    aput-object v4, v7, v0

    aput-object v6, v7, v11

    const/4 v0, 0x5

    aput-object v8, v7, v0

    const/4 v0, 0x6

    aput-object v10, v7, v0

    const/4 v0, 0x7

    aput-object v12, v7, v0

    const/16 v0, 0x8

    aput-object v14, v7, v0

    const/16 v0, 0x9

    aput-object v13, v7, v0

    aput-object v5, v7, v9

    .line 12
    sput-object v7, Lt1/g;->C:[Lt1/g;

    .line 13
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lt1/g;->A:Ljava/util/Map;

    .line 14
    invoke-static {}, Lt1/g;->values()[Lt1/g;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    aget-object v4, v0, v3

    .line 15
    sget-object v5, Lt1/g;->A:Ljava/util/Map;

    iget-object v6, v4, Lt1/g;->n:Ljava/lang/Class;

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    iget v4, v4, Lt1/g;->o:I

    if-le v4, v2, :cond_0

    move v2, v4

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 17
    :cond_1
    sput v2, Lt1/g;->B:I

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lt1/b;",
            ">;I)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    iput-object p3, p0, Lt1/g;->n:Ljava/lang/Class;

    .line 3
    iput p4, p0, Lt1/g;->o:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lt1/g;
    .locals 1

    const-class v0, Lt1/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lt1/g;

    return-object p0
.end method

.method public static values()[Lt1/g;
    .locals 1

    sget-object v0, Lt1/g;->C:[Lt1/g;

    invoke-virtual {v0}, [Lt1/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lt1/g;

    return-object v0
.end method
