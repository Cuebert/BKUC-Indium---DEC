.class public final Lt0/h;
.super Lt0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/h$a;
    }
.end annotation


# static fields
.field public static final p:Lt0/h$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt0/h$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt0/h$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lt0/h;->p:Lt0/h$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "androidx.credentials.TYPE_CREATE_CREDENTIAL_PROVIDER_CONFIGURATION_EXCEPTION"

    invoke-direct {p0, v0, p1}, Lt0/e;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method
