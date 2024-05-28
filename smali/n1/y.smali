.class public final synthetic Ln1/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly1/e;


# static fields
.field public static final synthetic a:Ln1/y;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Ln1/y;

    invoke-direct {v0}, Ln1/y;-><init>()V

    sput-object v0, Ln1/y;->a:Ln1/y;

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

    check-cast p1, Lcom/google/android/gms/internal/play_billing/z4;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/play_billing/l;->d()[B

    move-result-object p1

    return-object p1
.end method
