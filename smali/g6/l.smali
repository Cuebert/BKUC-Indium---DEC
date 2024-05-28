.class public final enum Lg6/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lg6/l;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lg6/l;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum o:Lg6/l;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum p:Lg6/l;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum q:Lg6/l;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum r:Lg6/l;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum s:Lg6/l;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field private static final synthetic t:[Lg6/l;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lg6/l;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2}, Lg6/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lg6/l;->n:Lg6/l;

    new-instance v1, Lg6/l;

    const-string v3, "BASE"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4}, Lg6/l;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lg6/l;->o:Lg6/l;

    new-instance v3, Lg6/l;

    const-string v5, "TRANSLATE"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6}, Lg6/l;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lg6/l;->p:Lg6/l;

    new-instance v5, Lg6/l;

    const-string v7, "ENTITY_EXTRACTION"

    const/4 v8, 0x3

    .line 4
    invoke-direct {v5, v7, v8}, Lg6/l;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lg6/l;->q:Lg6/l;

    new-instance v7, Lg6/l;

    const-string v9, "CUSTOM"

    const/4 v10, 0x4

    .line 5
    invoke-direct {v7, v9, v10}, Lg6/l;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lg6/l;->r:Lg6/l;

    new-instance v9, Lg6/l;

    const-string v11, "DIGITAL_INK"

    const/4 v12, 0x5

    .line 6
    invoke-direct {v9, v11, v12}, Lg6/l;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lg6/l;->s:Lg6/l;

    const/4 v11, 0x6

    new-array v11, v11, [Lg6/l;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lg6/l;->t:[Lg6/l;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static values()[Lg6/l;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    sget-object v0, Lg6/l;->t:[Lg6/l;

    invoke-virtual {v0}, [Lg6/l;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lg6/l;

    return-object v0
.end method
