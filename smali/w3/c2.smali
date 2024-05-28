.class public final synthetic Lw3/c2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll5/d;


# static fields
.field public static final synthetic a:Lw3/c2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw3/c2;

    invoke-direct {v0}, Lw3/c2;-><init>()V

    sput-object v0, Lw3/c2;->a:Lw3/c2;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/Map$Entry;

    check-cast p2, Ll5/e;

    invoke-static {p1, p2}, Lw3/d2;->i(Ljava/util/Map$Entry;Ll5/e;)V

    return-void
.end method
