.class public final Lt0/j;
.super Lt0/e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt0/j$a;
    }
.end annotation


# static fields
.field public static final p:Lt0/j$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt0/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lt0/j$a;-><init>(Lkotlin/jvm/internal/e;)V

    sput-object v0, Lt0/j;->p:Lt0/j$a;

    return-void
.end method

.method public constructor <init>(Ljava/lang/CharSequence;)V
    .locals 1

    const-string v0, "androidx.credentials.TYPE_CREATE_CREDENTIAL_UNSUPPORTED_EXCEPTION"

    invoke-direct {p0, v0, p1}, Lt0/e;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;)V

    return-void
.end method
