.class public final synthetic Lcom/google/android/gms/measurement/internal/e2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/measurement/internal/u2;


# static fields
.field public static final synthetic a:Lcom/google/android/gms/measurement/internal/e2;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/measurement/internal/e2;

    invoke-direct {v0}, Lcom/google/android/gms/measurement/internal/e2;-><init>()V

    sput-object v0, Lcom/google/android/gms/measurement/internal/e2;->a:Lcom/google/android/gms/measurement/internal/e2;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zza()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lcom/google/android/gms/measurement/internal/x2;->c:Lcom/google/android/gms/measurement/internal/w2;

    invoke-static {}, Lcom/google/android/gms/internal/measurement/ae;->d()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
