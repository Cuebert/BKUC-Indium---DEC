.class public final synthetic Li2/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li2/m0$b;


# static fields
.field public static final synthetic a:Li2/x;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Li2/x;

    invoke-direct {v0}, Li2/x;-><init>()V

    sput-object v0, Li2/x;->a:Li2/x;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-static {p1}, Li2/m0;->y0(Landroid/database/Cursor;)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
