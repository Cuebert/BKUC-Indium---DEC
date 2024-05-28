.class public final enum Lh6/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lh6/a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum n:Lh6/a;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum o:Lh6/a;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum p:Lh6/a;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field public static final enum q:Lh6/a;
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation
.end field

.field private static final synthetic r:[Lh6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lh6/a;

    const-string v1, "FACE_DETECTION"

    const/4 v2, 0x0

    .line 1
    invoke-direct {v0, v1, v2}, Lh6/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lh6/a;->p:Lh6/a;

    new-instance v1, Lh6/a;

    const-string v3, "SMART_REPLY"

    const/4 v4, 0x1

    .line 2
    invoke-direct {v1, v3, v4}, Lh6/a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lh6/a;->q:Lh6/a;

    new-instance v3, Lh6/a;

    const-string v5, "TRANSLATE"

    const/4 v6, 0x2

    .line 3
    invoke-direct {v3, v5, v6}, Lh6/a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lh6/a;->n:Lh6/a;

    new-instance v5, Lh6/a;

    const-string v7, "ENTITY_EXTRACTION"

    const/4 v8, 0x3

    .line 4
    invoke-direct {v5, v7, v8}, Lh6/a;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lh6/a;->o:Lh6/a;

    const/4 v7, 0x4

    new-array v7, v7, [Lh6/a;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lh6/a;->r:[Lh6/a;

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

.method public static values()[Lh6/a;
    .locals 1
    .annotation build Landroidx/annotation/RecentlyNonNull;
    .end annotation

    sget-object v0, Lh6/a;->r:[Lh6/a;

    invoke-virtual {v0}, [Lh6/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lh6/a;

    return-object v0
.end method
